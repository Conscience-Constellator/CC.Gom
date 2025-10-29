package CC.Encycloped.Abs.Scal.Gom;

import CC.Util.By.Get_Q_By_Q;
import CC.$.Tran;
import CC.$.Tran_Rapr;

public interface Tran_Inbl
<//<editor-fold desc="Generic">
	Vectr_Typ extends Get_Q_By_Q
	In_Typ extends Inbl<Vectr_Typ>,
	Tran_Typ extends Tran<Vectr_Typ,Vectr_Typ>,
>//</editor-fold>
	extends
		Inbl_Havr<Vectr_Typ,In_Typ>,
		Tran_Rapr<Vectr_Typ,Vectr_Typ,Tran_Typ>
{
	@Override
	default Tran<Vectr_Typ,Vectr_Typ> Get_Rapd_Tran(){return null;}
	@Override
	default void Set_Rapd_Tran(Tran_Typ Tran){}
	@Override
	default void Tran_AB(Vectr_Typ From,Vectr_Typ To){Tran_Rapr.super.Tran_AB(From,To);}
	@Override
	default void Tran_Rev_AB(Vectr_Typ From,Vectr_Typ To){Tran_Rapr.super.Tran_Rev_AB(From,To);}

	class Tran_Inbl_Imp
	<//<editor-fold desc="Generic">
		Vectr_Typ extends Get_Q_By_Q
		,In_Typ extends Inbl<Vectr_Typ>
		,Tran_Typ extends Tran<Vectr_Typ,Vectr_Typ>
	>//</editor-fold>
		extends In_Havr_Imp<Vectr_Typ,In_Typ> implements Tran_Inbl<Vectr_Typ,In_Typ,Tran_Typ>
	{
		public Tran_Inbl_Imp(In_Typ In,Tran_Typ Tran)
		{
			super(In);
			Set_Rapd_Tran(Tran);
		}
		public Tran_Inbl_Imp(In_Typ Rapd){this(Rapd,(Tran_Typ)Rapd);}
		public Tran_Inbl_Imp(){}

		public Tran_Typ Tran;
			@Override
			public Tran_Typ Get_Rapd_Tran(){return Tran;}
			@Override
			public void Set_Rapd_Tran(Tran_Typ Tran){this.Tran=Tran;}
	}
	interface Tran_Inbl_Rapr
	<//<editor-fold desc="Generic">
		Vectr_Typ extends Get_Q_By_Q
		,In_Typ extends Inbl<Vectr_Typ>
		,Tran_Typ extends Tran<Vectr_Typ,Vectr_Typ>
		,Tran_In_Typ extends Tran_Inbl<Vectr_Typ,In_Typ,Tran_Typ>
		>//</editor-fold>
		extends Tran_Inbl<Vectr_Typ,In_Typ,Tran_Typ>
	{
		Tran_In_Typ Tran_In();
		void Set_Tran_In(Tran_In_Typ Rapd);

		@Override default Tran<Vectr_Typ,Vectr_Typ> Get_Rapd_Tran(){return Tran_In().Get_Rapd_Tran();}
		@Override default void Set_Rapd_Tran(Tran_Typ Tran){Tran_In().Set_Rapd_Tran(Tran);}
		@Override default In_Typ In_Rapd(){return Tran_In().In_Rapd();}
		@Override default void Set_In_Rapd(In_Typ In){Tran_In().Set_In_Rapd(In);}

		class Tran_Inbl_Rapr_Imp
		<//<editor-fold desc="Generic">
			Vectr_Typ extends Get_Q_By_Q
			,In_Typ extends Inbl<Vectr_Typ>
			,Tran_Typ extends Tran<Vectr_Typ,Vectr_Typ>
			,Tran_In_Typ extends Tran_Inbl<Vectr_Typ,In_Typ,Tran_Typ>
		>//</editor-fold>
			implements Tran_Inbl_Rapr<Vectr_Typ,In_Typ,Tran_Typ,Tran_In_Typ>
		{
			public Tran_Inbl_Rapr_Imp(Tran_In_Typ Rapd){Set_Tran_In(Rapd);}
			public Tran_Inbl_Rapr_Imp(){}

			public Tran_In_Typ Tran_Bordr_Rap;
				@Override public Tran_In_Typ Tran_In(){return Tran_Bordr_Rap;}
				@Override public void Set_Tran_In(Tran_In_Typ Rapd){Tran_Bordr_Rap=Rapd;}
		}
	}
}