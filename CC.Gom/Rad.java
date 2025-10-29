package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.Ad_Reg_Task;
import CC.Util.By.Get_Q_By_Q;

public abstract class Rad<Vectr_Typ extends Get_Q_By_Q> extends Rad_Havr<Vectr_Typ> implements Bordr<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Rad.class);

	public Rad(double Rad){Set_Rad(Rad);}
	public Rad(){}

	@Override public int Dim_Num(){return 0;}

	@Override public double Tax_Rad_Dubl(){return 0;}
	@Override public double Hyp_Rad_Dubl(){return 0;}
	@Override public int Min_Int(int Dim){return (int)Rad;}
	@Override public long Min_Long(int Dim){return (long)Rad;}
	@Override public float Min_Flot(int Dim){return (int)Rad;}
	@Override public double Min_Dubl(int Dim){return Rad;}
	@Override public int Max_Int(int Dim){return -((int)Rad);}
	@Override public long Max_Long(int Dim){return -((long)Rad);}
	@Override public float Max_Flot(int Dim){return -((float)Rad);}
	@Override public double Max_Dubl(int Dim){return -Rad;}
}