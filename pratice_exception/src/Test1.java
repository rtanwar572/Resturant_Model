public class Test1 {
    int count=0;
    public void a(){
        try{
            count++;
            try {
                count++;
                try{
                    count++;
                    throw new Exception();
                }
                catch (Exception ex){
                    count++;
                    throw new Exception();
                }
            }
            catch (Exception ex){
                count++;
            }
        }
        catch (Exception ex){
            count++;
        }
    }
    public void disp(){
        System.out.println(count);
    }
}
