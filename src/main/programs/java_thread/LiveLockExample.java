package java_thread;

public class LiveLockExample {
    static class Spoon {
        private Diner owner;

        public Spoon(Diner d) {
            owner = d;
        }

        public Diner getOwner() {
            return owner;
        }

        public void setOwner(Diner owner) {
            this.owner = owner;
        }

        public synchronized void use() {
            System.out.println(owner.name + " has eaten!");
        }
    }

    static class Diner {
        private String name;
        private boolean isHungry;

        public Diner(String n) {
            name = n;
            isHungry = true;
        }

        public String getName() {
            return name;
        }

        public boolean isHungry() {
            return isHungry;
        }

        public void eatWith(Spoon spoon, Diner spouse) {
            while (isHungry) {
                // Don't have the spoon, so wait patiently for spouse.
                if (spoon.getOwner() != this) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        continue;
                    }
                    continue;
                }

                // If spouse is hungry, insist upon passing the spoon.
                if (spouse.isHungry()) {
                    System.out.println(name + ": You eat, my love! " + name + " passes the spoon to " + spouse.getName() + "!");
                    spoon.setOwner(spouse);
                    continue;
                }

                // Spouse is not hungry, so finally eat
                spoon.use();
                isHungry = false;
                System.out.println(name + ": I'm stuffed!");
            }
        }
    }

    public static void main(String[] args) {
        final Diner husband = new Diner("Bob");
        final Diner wife = new Diner("Alice");
        final Spoon s = new Spoon(husband);

        new Thread(() -> husband.eatWith(s, wife)).start();
        new Thread(() -> wife.eatWith(s, husband)).start();

    }
}
