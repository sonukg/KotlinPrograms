import java.util.ArrayList;
import java.util.List;

public class SumOfTreeValue {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.getChild().add(new Tree(2));
        tree.getChild().add(new Tree(4));
        tree.getChild().get(0).getChild().add(new Tree(3));
        tree.getChild().get(1).getChild().add(new Tree(5));
        tree.getChild().get(1).getChild().add(new Tree(6));
        int total = TreeUtils.sumTree(tree);
        System.out.println(total);
    }

    public static class Tree {
        int value;
        List<Tree> child;

        public Tree(int value) {
            this.value = value;
            this.child = new ArrayList<>();
        }

        public int getValue() {
            return value;
        }

        public List<Tree> getChild() {
            return child;
        }
    }

    public static class TreeUtils {
        public static int sumTree(Tree root) {
            if (root == null) {
                return 0;
            }
            int sum = root.getValue();
            for (Tree child : root.getChild()) {
                sum += sumTree(child);
            }
            return sum;
        }

    }

}