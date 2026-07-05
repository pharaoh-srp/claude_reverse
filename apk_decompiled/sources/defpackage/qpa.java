package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;

/* JADX INFO: loaded from: classes3.dex */
public final class qpa implements rz7 {
    public final /* synthetic */ fk0 E;
    public final /* synthetic */ Context F;
    public final /* synthetic */ w7 G;
    public final /* synthetic */ rwe H;

    public qpa(fk0 fk0Var, Context context, w7 w7Var, rwe rweVar) {
        this.E = fk0Var;
        this.F = context;
        this.G = w7Var;
        this.H = rweVar;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String strM949unboximpl = ((AccountId) obj).m949unboximpl();
        String strM1071unboximpl = ((OrganizationId) obj2).m1071unboximpl();
        strM949unboximpl.getClass();
        strM1071unboximpl.getClass();
        ((jj) obj3).getClass();
        fk0 fk0Var = this.E;
        String strE = fk0Var.e();
        fk0Var.a(strM949unboximpl, true);
        if (!(strE == null ? false : AccountId.m946equalsimpl0(strM949unboximpl, strE))) {
            Context context = this.F;
            context.getClass();
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences("account_prefs".concat(strM949unboximpl), 0);
            sharedPreferences.getClass();
            String string = sharedPreferences.getString("selected_org_id", null);
            String strM1066constructorimpl = string != null ? OrganizationId.m1066constructorimpl(string) : null;
            lsc lscVarP = mpk.P(strM1066constructorimpl != null ? OrganizationId.m1065boximpl(strM1066constructorimpl) : null);
            mpk.P(sharedPreferences.getString("display_email", null));
            mpk.P(sharedPreferences.getString("conway_saved_client_id", null));
            new mdg();
            new mdg();
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString("selected_org_id", strM1071unboximpl);
            editorEdit.apply();
            lscVarP.setValue(OrganizationId.m1065boximpl(strM1071unboximpl));
        }
        this.G.b(strM949unboximpl);
        this.H.E.m(be5.R, new ppa(2));
        return iei.a;
    }
}
