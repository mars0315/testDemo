package systemProject;

public class HomeWork01 {
    public static void main(String[] args) {
        int m;//表示发售机票数量
        double es;//表示公司的平均利润
        double p;//表示声誉指标
        double sm;
        double pp;
        //m取值在305到325之间
        for (m=305;m<=325;m++){
            sm=0;
            p=0;
            //k取值在0到m-305之间
           for (int k=0;k<m-305;k++){
                for (int i = m-k+1; i <m ; i++) {
                double xx=Math.pow(0.03,k);//求幂指数0.03的k次方
                double xy=Math.pow(0.97,(m-k));//求幂指数0.97的m-k次方
                pp=i/(k+1)*xx*xy;//（m-k+1:m）除以（1:k）乘以0.03的k次方乘以0.97的m-k次方
                p=p+pp;
                sm=sm+(m-k-300)*pp/k+1;
//                    System.out.println("sm="+sm);
                }
            }
                es=(1/180)*(0.97*m-1.1*sm)-1;
                System.out.println("es="+es);
                System.out.println("m="+m);
                System.out.println("p="+p);
        }
    }
}
