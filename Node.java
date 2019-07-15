public class Node {
        public Node right;
        public Node left;
        public int  data;


       public Node(int data){                   //constructor for a node
            this.data=data;
        }

        public int getData(){                   //returns the data field of the node
            return data;
        }

        public void setData(int data){          //sets the data field of the node
            this.data=data;
        }

        public void setLeft(int data){          //sets the left field of the node
            left=new Node(data);
        }

        public void setRight(int data){         //sets the right field of the node
            right=new Node(data);
        }

        public Node getRight(){                //returns the right field of the node
        return right;
        }

        public Node getLeft(){                 //returns the left field of the node
        return left;
         }

        public boolean isleaf(){               // checks if the node is a leaf node
            if (right==null && left==null)
                return true;
            else
                return false;
        }
}
