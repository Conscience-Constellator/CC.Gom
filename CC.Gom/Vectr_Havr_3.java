package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap;
import CC.Util.By.Get_Q_By_Q;

import static CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.Rflect.Clas_Rap.Ad_Reg_Task;

public interface Vectr_Havr_3<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Havr_2<Vectr_Typ>
{
	Clas_Rap Class=Ad_Reg_Task(Vectr_Havr_3.class);

	Vectr_Typ Get_Vectr_C();
		@Override default Vectr_Typ Vectr(int Num)
		{
			switch(Num)
			{
				case 1->{return Vectr_A();}
				case 2->{return Vectr_B();}
				case 3->{return Get_Vectr_C();}
				default->{return null;}
			}
		}
	@Override default int Vectr_Num(){return 3;}

	interface Vectr_Setbl_3<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_2<Vectr_Typ>,Vectr_Havr_3<Vectr_Typ>
	{
		void Set_Vectr_C(Vectr_Typ C);
			default void Set_Vectrg(Vectr_Typ A,Vectr_Typ B,Vectr_Typ C)
			{
				Vectr_Setbl_2.super.Set_Vectrg(A,B);
				Set_Vectr_C(C);
			}

		class Vectr_Setbl_3_Imp<Vectr_Typ extends Get_Q_By_Q> extends Vectr_Setbl_2.Vectr_Setbl_2_Imp<Vectr_Typ> implements Vectr_Setbl_3<Vectr_Typ>
		{
			public Vectr_Setbl_3_Imp(Vectr_Typ A,Vectr_Typ B,Vectr_Typ C){Set_Vectrg(A,B,C);}
			public Vectr_Setbl_3_Imp(){}

			public Vectr_Typ Vectr_C;
				@Override public Vectr_Typ Get_Vectr_C(){return Vectr_C;}
				@Override public void Set_Vectr_C(Vectr_Typ C){Vectr_C=C;}
		}
	}
}