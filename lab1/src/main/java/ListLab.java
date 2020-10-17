/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author maxso
 */
public class ListLab {
    public class Node{
        private int element;
        private Node next;
        Node(int e){
        element=e;
        next=null;
        }
    }
     private Node head; //указатель на первый элемент
     private Node tail; //указатель на последний элемент
     ListLab(int e){
         head=new Node(e);
         tail=head;
     }
     public void add(int e){ //Дабовление элемента в список
        Node tmp=new Node(e);
        tail.next=tmp;
        tail=tail.next;
     }
     public void printAll(){ // Вывод всех элементов списка
         Node tmp=head;
         while(tmp!=null){
             System.out.print(tmp.element + " ");
             tmp=tmp.next;
         }
     }
     public int get(int k){                 //Получение определенного элемента списка (отсчет с 1)
         Node tmp=head;
         for(int i=1;i<k;i++){
             tmp=tmp.next;
             if(tmp==null){                 // Проверка на количество элементов
                 System.out.print("Такого элемента не существует");
                 return 0;
             }
         }
         return tmp.element;
     }
      public void delete(int k){                 //Удаление определенного элемента списка (отсчет с 1)
        
         if(k==1){
             head=head.next;
             return;
         }
         Node tmp=head;
         for(int i=1;i<k-1;i++){
             tmp=tmp.next;
             if(tmp==null){             
                 System.out.print("Такого элемента не существует");
                 return;
             }
         }
         tmp.next=tmp.next.next;
     }
      public int amountElem(){
          Node tmp=head;
          int k=0;
          while(tmp!=null){
              k++;
              tmp=tmp.next;
          }
          return k;
      }
}
