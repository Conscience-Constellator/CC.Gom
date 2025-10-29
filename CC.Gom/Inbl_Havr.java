package CC.Encycloped.Abs.Scal.Gom;

import CC.Encycloped.Abs.Org.Comput.Soft.Ling.Java.X.Nevr_Neds_Ovrid;
import CC.Util.By.Get_Q_By_Q;

public interface Inbl_Havr<Vectr_Typ extends Get_Q_By_Q,In_Typ extends Inbl<Vectr_Typ>> extends Inbl<Vectr_Typ>
{
	In_Typ In_Rapd();
		@Override
		default Inbl<Vectr_Typ> Bas_In(){return In_Rapd().Bas_In();}
	void Set_In_Rapd(In_Typ Rapd);
		@Override
		@Nevr_Neds_Ovrid
		default int Dim_Num(){return In_Rapd().Dim_Num();}
		@Override default boolean In(Vectr_Typ Vectr){return In_Rapd().In(Vectr);}
		@Override default boolean In(Bordr<Vectr_Typ> Bordr){return In_Rapd().In(Bordr);}

	class In_Havr_Imp<Vectr_Typ extends Get_Q_By_Q,In_Typ extends Inbl<Vectr_Typ>> implements Inbl_Havr<Vectr_Typ,In_Typ>
	{
		public In_Havr_Imp(In_Typ Rapd){Set_In_Rapd(Rapd);}
		public In_Havr_Imp(){}

		public In_Typ In_Rapd;
			public In_Typ In_Rapd(){return In_Rapd;}
			public void Set_In_Rapd(In_Typ Rapd){In_Rapd=Rapd;}
	}
}