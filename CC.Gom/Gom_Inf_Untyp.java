package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;
import CC.Encycloped.Concept.Typ_Abs;

public class Gom_Inf_Untyp extends CC.Encycloped.Abs.Scal.Gom.Gom_Inf
{
	public static final Clas_Rap Class=Init_StRt(Gom_Inf_Untyp.class
		,Clas_Rap.class
	);/*Dep ?done*/

	public Gom_Inf_Untyp(int Dim,Typ_Abs Type)
	{
		super(Dim);
		Set_Typ(Type);
	}
	public Gom_Inf_Untyp(){}

	public Typ_Abs Type;
		public void Set_Typ(Typ_Abs Type){this.Type=Type;}
		public Typ_Abs Get_Typ(int Dim){return Type;}
		public Typ_Abs Get_Typ(){return Type;}

	static{
		Init_Nd(Gom_Inf_Untyp.class);}
}