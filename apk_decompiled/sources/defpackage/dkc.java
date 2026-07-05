package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.types.strings.AccountId;
import com.anthropic.claude.types.strings.OrganizationId;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class dkc {
    public final q7 a;
    public final ekc b;
    public final zy1 c = wd6.P(1, 4, py1.F);

    public dkc(q7 q7Var, ekc ekcVar) {
        this.a = q7Var;
        this.b = ekcVar;
    }

    public final void a(String str) {
        Object obj;
        Object hreVar;
        str.getClass();
        smh smhVar = (smh) this.b;
        synchronized (smhVar) {
            smhVar.e = smhVar.d;
            obj = null;
            smhVar.d = null;
            smhVar.a(true);
        }
        try {
            List list = xah.a;
            xah.e(6, "Changing organizations to ".concat(str), null, null);
            Iterator<T> it = this.a.a().getMemberships().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (OrganizationId.m1068equalsimpl0(((Membership) next).getOrganization().m116getUuidXjkXN6I(), str)) {
                    obj = next;
                    break;
                }
            }
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (obj == null) {
            throw new IllegalStateException(("Organization " + OrganizationId.m1070toStringimpl(str) + " not found in account " + AccountId.m948toStringimpl(this.a.a().m106getUuidislZJdo())).toString());
        }
        hreVar = (Membership) obj;
        Throwable thA = jre.a(hreVar);
        if (thA == null) {
            this.c.r(OrganizationId.m1065boximpl(str));
            return;
        }
        smh smhVar2 = (smh) this.b;
        synchronized (smhVar2) {
            String str2 = smhVar2.e;
            if (str2 != null) {
                smhVar2.d = str2;
                if (smhVar2.a.a.contains("third_party_analytics_disabled_for_org_".concat(str2))) {
                    fk0 fk0Var = smhVar2.a;
                    String strConcat = "third_party_analytics_disabled_for_org_".concat(str2);
                    SharedPreferences sharedPreferences = fk0Var.a;
                    smhVar2.a(sharedPreferences.contains(strConcat) ? sharedPreferences.getBoolean(strConcat, false) : sharedPreferences.getBoolean("third_party_analytics_disabled_for_org", false));
                }
            }
        }
        throw thA;
    }
}
