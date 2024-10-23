package BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BuildTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTree {
        static int idx = -1;
        public Node buildPreOrder(int nodes[]) {
            idx++;
            if(nodes[idx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildPreOrder(nodes);
            newNode.right = buildPreOrder(nodes);

            return newNode;
        }

        /**
         * root -> left subtree -> right subtree
         *
         * @param root
         */
        public void preOrderTraversal(Node root) {
            if(root == null) {
                return;
            }

            System.out.print(root.data + " ");
            preOrderTraversal(root.left);
            preOrderTraversal(root.right);
        }

        /**
         * left subtree -> root -> right subtree
         *
         * @param root
         */
        public void inOrderTraversal(Node root) {
            if(root == null) {
                return;
            }
            inOrderTraversal(root.left);
            System.out.print(root.data + " ");
            inOrderTraversal(root.right);
        }

        /**
         * left subtree -> right subtree -> root
         *
         * @param root
         */
        public void postOrderTraversal(Node root) {
            if(root == null) {
                return;
            }
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.print(root.data + " ");
        }

        public void levelOrderTraversal(Node root) {
            if(root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            while(!q.isEmpty()) {
                Node currentNode = q.remove();
                if(currentNode == null) {
                    System.out.println();
                    if(q.isEmpty()) {
                        break;
                    } else {
                        q.add(null); // adding null to give enter while printing
                    }
                } else {
                    System.out.print(currentNode.data + " ");
                    if(currentNode.left != null) {
                        q.add(currentNode.left);
                    }
                    if(currentNode.right != null) {
                        q.add(currentNode.right);
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int nodes[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildPreOrder(nodes);
        System.out.println(root.data);
        binaryTree.preOrderTraversal(root);
        System.out.println();
        binaryTree.inOrderTraversal(root);
        System.out.println();
        binaryTree.postOrderTraversal(root);
        System.out.println();
        binaryTree.levelOrderTraversal(root);
    }
}
