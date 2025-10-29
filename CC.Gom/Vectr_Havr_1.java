package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;

public interface Vectr_Havr_1<Vectr_Typ extends Get_Q_By_Q> extends Vectrg_Havr<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Vectr_Havr_1.class);

	Vectr_Typ Vectr_A();
		@Override default Vectr_Typ Vectr(int Num){return (Num==1)?Vectr_A():null;}
		@Override default int Vectr_Num(){return 1;}

	@Override default int Dim_Num(){return Vectr_A().Valu_Num();}

	interface Vectr_Setbl_1<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Havr_1<Vectr_Typ>
	{
		void Set_Vectr_A(Vectr_Typ A);
			default void Set_Vectrg(Vectr_Typ A){Set_Vectr_A(A);}

		class Vectr_Setbl_1_Imp<Vectr_Typ extends Get_Q_By_Q> implements Vectr_Setbl_1<Vectr_Typ>
		{
			public Vectr_Setbl_1_Imp(Vectr_Typ A){Set_Vectr_A(A);}
			public Vectr_Setbl_1_Imp(){}

			public Vectr_Typ Vectr_A;
			@Override public Vectr_Typ Vectr_A(){return Vectr_A;}
			@Override public void Set_Vectr_A(Vectr_Typ A){Vectr_A=A;}
		}
	}
}