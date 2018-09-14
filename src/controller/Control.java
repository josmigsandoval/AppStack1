package controller;

import exceptions.*;
import model.*;
import view.IoManager;

public class Control {

    private IoManager io;
    private Stack stack;

    public Control() {
        io = new IoManager();
        stack = new Stack();
    }

    public void menu() {
        int op = 0;
        do {
            try {
                op = io.readMenu();
                switch (op) {
                    case 1:
                        push();
                        break;
                    case 2:
                        pop();
                        break;
                    case 3:
                        last();
                        break;
                    case 4:
                        coming();
                        break;
                    case 5:
                        size();
                        break;
                    case 6: printStack();
                        break;
                    case 7: break;
                    default:
                        io.showErrorMessage("Opcion incorrecta");
                }
            } catch (NumberFormatException e) {
                io.showErrorMessage("Debe ser un valor entero");
            }
        } while (op != 7);

    }

    public void push() {
        Person person = createPerson();
        stack.push(person);
        io.showMessage("Valor ingresado");
    }

    public Person createPerson(){
        int id = io.readInt("Id de la persona");
        String name = io.readString("Nombre completo");
        Person p = new Person(id,name);
        return p;
    }
    public void pop() {
    }
    
    public void last(){
        
    }

    public void coming(){
        
    }
    
    public void size(){
        
    }
    
    public void printStack() {
         StringBuilder text = new StringBuilder();
        if (stack.isEmpty())
            io.showMessage("La cola esta vacia");
        else{
            Node p = stack.getHead();
            do{
                text.append(p.getNext().getPerson());
                text.append("\n");
                p = p.getNext();
            } while (p!=stack.getHead());
            io.showMessage(text.toString());
        }
        
    }


}
