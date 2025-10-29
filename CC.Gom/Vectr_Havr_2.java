package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.*;
import CC.Util.By.Get_Q_By_Q;

public interface Vectr_Havr_2<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Havr_1<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Vectr_Havr_2.class);

	Vectr_Typ Vectr_B();
		@Override default Vectr_Typ Vectr(int Num)
		{
			switch(Num)
			{
				case 1->{return Vectr_A();}
				case 2->{return Vectr_B();}
				default->{return null;}
			}
		}
	@Override default int Vectr_Num(){return 2;}

	interface Vectr_Setbl_2<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_1<Vectr_Typ>,Vectr_Havr_2<Vectr_Typ>
	{
		void Set_Vectr_B(Vectr_Typ B);
			default void Set_Vectrg(Vectr_Typ A,Vectr_Typ B)
			{
				Vectr_Setbl_1.super.Set_Vectrg(A);
				Set_Vectr_B(B);
			}

		class Vectr_Setbl_2_Imp<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_1.Vectr_Setbl_1_Imp<Vectr_Typ> implements Vectr_Setbl_2<Vectr_Typ>
		{
			public Vectr_Setbl_2_Imp(Vectr_Typ A,Vectr_Typ B){Set_Vectrg(A,B);}
			public Vectr_Setbl_2_Imp(){}

			public Vectr_Typ Vectr_B;
				@Override public Vectr_Typ Vectr_B(){return Vectr_B;}
				@Override public void Set_Vectr_B(Vectr_Typ B){Vectr_B=B;}
		}
	}
}