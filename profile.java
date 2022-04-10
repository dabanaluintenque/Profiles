

// How to create a profile for different people in the company?
class Profile<T>{

    T data[];

  Profile(int capacity){

      data = (T[]) new Object[capacity];
  }

  public T getProfile(int index){

      return data[index];
  }

  public void setProfile(int index, T element){

      data[index] = element;
  }
    public static void main(String[] args) {


    Profile myprofile = new Profile(3);

     myprofile.setProfile(0,"Jorge");
     myprofile.setProfile(1,"Dabana");
     myprofile.setProfile(2,"Erwin");


     System.out.println("First Name: " +myprofile.getProfile(0));
     System.out.println("Second Name: " +myprofile.getProfile(1));
     System.out.println("Thirt Name: " +myprofile.getProfile(2));
        

        
    }
}