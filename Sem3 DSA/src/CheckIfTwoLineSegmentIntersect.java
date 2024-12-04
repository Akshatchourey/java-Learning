public class CheckIfTwoLineSegmentIntersect{
    static String doIntersect(int[] x1, int[] y1, int[] x2, int[] y2){
        int x11=x1[0], y11=y1[0], x21=x2[0], y21=y2[0];
        int x12=x1[1], y12=y1[1], x22=x2[1], y22=y2[1];
        try {
            int m1 = (y21-y11)/(x21-x11);
            int m2 = (y22-y12)/(x22-x12);
            if(m1 != m2) return "true";
            else{
                if(m1==0 && y11==y12) return "true";
                else{
                    if(y12 == m1*(x12-x11)+y11) return "true";
                    return "false";
                }
            }
        }catch (Exception e){
            int temp1 = x21-x11;
            int temp2 = x22-x12;
            if(temp1==0 && temp2==0){
                if(x11==x12){
                    if(y11!=y21 || y21!=y22) return "true";
                    else if(y11==y12) return "true";
                    return "false";
                }
                return "false";
            }
            else if((temp1==0 && y11!=y21) || (temp2==0 && y12!=y22)) return "true";
            int m1;
            if(temp1==0){
                m1 = (y22-y12)/(x22-x12);
                if(y11 == m1*(x11-x12)+y12) return "true";
                return "false";
            }else{
                m1 = (y21-y11)/(x21-x11);
                if(y12 == m1*(x12-x11)+y11) return "true";
                return "false";
            }
        }
    }
    public static void main(String[] args){
        int[] x1 = {1,1}; int[] x2 = {1,2}; int[] y1 = {10,1}; int[] y2 = {10,2};
        System.out.println(doIntersect(x1,y1,x2,y2));
        // Will give you wrong ans only when line
           // intersect beyond end points which is not
              // considered according to the question.
    }
}
