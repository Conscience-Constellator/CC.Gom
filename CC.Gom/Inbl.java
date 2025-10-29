package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Stat_Notif.*;

import CC.Encycloped.Concept.Bool.Bool_Par;
import CC.Util.By.Grup.Get_Prim_By_Prim;
import CC.Util.By.Get_Q_By_Q;
import CC.Util.By.Set_Q_By_Q;
import CC.$.Tran_Revbl;
import java.lang.reflect.Method;

/**An object that can determine whether A spacial object is in it.*/
public interface Inbl<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Typ_Havr<Vectr_Typ>,Tran_Revbl<Vectr_Typ,Vectr_Typ>,Dim_Num_Havr
{
	Clas_Rap Class=Init_StRt(Inbl.class
		,Clas_Rap.class
		,Method.class
		,Bool_Par.class
	);/*Dep done*/

	boolean Out=false,In=!Out;
		Bool_Par<String,String> In_=Init_Nd(new Bool_Par<>("Out","In"),Inbl.class);
	static Method In(Class<?> Clas){return null;}

	boolean In(Vectr_Typ B);
	boolean In(Bordr<Vectr_Typ> B);
	
	@Override default void Tran_AB(Vectr_Typ From,Vectr_Typ To){((Set_Q_By_Q)To).Set_Sorc((Get_Prim_By_Prim)From);}
	@Override default void Tran_Rev_AB(Vectr_Typ From,Vectr_Typ To){((Set_Q_By_Q)To).Set_Sorc((Get_Prim_By_Prim)From);}

	default Inbl<Vectr_Typ> Bas_In(){return this;}

	Inbl<Set_Q_By_Q>
		Nowar=new Inbl<>()
		{
			@Override public boolean In(Set_Q_By_Q B){return false;}
			@Override public boolean In(Bordr B){return false;}
			@Override public int Dim_Num(){return 0;}
		}
		,Evwar=new Inbl<>()
		{
			@Override public boolean In(Set_Q_By_Q B){return true;}
			@Override public boolean In(Bordr B){return true;}
			@Override public int Dim_Num(){return 0;}
		}
	;
}