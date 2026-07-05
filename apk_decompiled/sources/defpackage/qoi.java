package defpackage;

import com.anthropic.claude.api.account.Account;
import com.anthropic.claude.api.account.Membership;
import com.anthropic.claude.api.account.Organization;
import com.anthropic.claude.types.strings.Capability;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class qoi {
    public static final umg a = new umg(new poi(0));
    public static final Set b = mp0.Z0(new String[]{"owner", "primary_owner", "membership_admin"});

    public static final Organization a(Account account) {
        account.getClass();
        List<Membership> memberships = account.getMemberships();
        ArrayList arrayList = new ArrayList();
        for (Object obj : memberships) {
            Organization organization = ((Membership) obj).getOrganization();
            Capability.Companion.getClass();
            if (eve.D(organization, Capability.CHAT)) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            pmf.d();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            pvg pvgVarC = eve.C(((Membership) next).getOrganization());
            do {
                Object next2 = it.next();
                pvg pvgVarC2 = eve.C(((Membership) next2).getOrganization());
                if (pvgVarC.compareTo(pvgVarC2) < 0) {
                    next = next2;
                    pvgVarC = pvgVarC2;
                }
            } while (it.hasNext());
        }
        return ((Membership) next).getOrganization();
    }

    public static final umg b() {
        return a;
    }
}
