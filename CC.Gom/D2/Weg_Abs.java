package CC.Encycloped.Abs.Scal.Gom.D2;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;
import CC.Util.By.Get_Q_By_Q;

public interface Weg_Abs<Vectr_Typ extends Get_Q_By_Q>
{
	Clas_Rap Class=Ad_Reg_Task(Weg_Abs.class);

	void Set_Tip(Vectr_Typ Tip);
	Vectr_Typ Tip();
	void Set_Ang(int Ang);
	int Ang();

	class Wedge<Vectr_Typ extends Get_Q_By_Q> implements Weg_Abs<Vectr_Typ>
	{
		public static final Clas_Rap Class=Init_StRt(Wedge.class);

		public Wedge(Vectr_Typ Tip,int Ang)
		{
			Set_Tip(Tip);
			Set_Ang(Ang);
		}
		public Wedge(){}

		public Vectr_Typ Tip;
			@Override public void Set_Tip(Vectr_Typ Tip){this.Tip=Tip;}
			@Override public Vectr_Typ Tip(){return Tip;}
		public int Ang;
			@Override public void Set_Ang(int Ang){this.Ang=Ang;}
			@Override public int Ang(){return Ang;}

		static{Init_Nd(Wedge.class);}
	}
}