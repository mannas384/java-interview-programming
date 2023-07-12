public class Service {


    Parent getDetail(Parent parent){

        if(parent instanceof Child){
            Child c = (Child) parent;
            return parent;
        }
       return null;
    }
}
