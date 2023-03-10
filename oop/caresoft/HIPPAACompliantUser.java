package java_stack.oop.caresoft;

public interface HIPPAACompliantUser {
    abstract boolean assignPin(int pin);
    abstract boolean accessAuthorized(Integer confirmedAuthID);
    
}