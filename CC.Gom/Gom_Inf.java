package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif;
import CC.Encycloped.Concept.Typ_Abs;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.Init_Nd;

public abstract class Gom_Inf
{
	static{
		Stat_Notif.Init_StRt(Gom_Inf.class);}

	public static final Clas_Rap Class=null;

	public Gom_Inf(int Dim){Set_Dim(Dim);}
	public Gom_Inf(){}

	public int Dim;
		public void Set_Dim(int Dim){this.Dim=Dim;}
		public int Get_Dim(){return Dim;}
	public abstract Typ_Abs Get_Typ(int Dim);

	static{
		Init_Nd(Gom_Inf.class);}
}