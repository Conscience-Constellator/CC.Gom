package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.Ad_Reg_Task;

public class Tax_Rad<Vectr_Typ extends Get_Q_By_Q> extends Rad<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Tax_Rad.class);

	public Tax_Rad(double Rad){super(Rad);}
	public Tax_Rad(){}

	@Override public int Dim_Num(){return 0;}

	@Override public double Tax_Rad_Dubl(){return Rad;}
	@Override public double Hyp_Rad_Dubl(){return 0;}
	@Override public boolean In(Vectr_Typ B){return false;}
	@Override public boolean In(Bordr<Vectr_Typ> B){return false;}
}