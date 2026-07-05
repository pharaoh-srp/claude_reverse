package defpackage;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes3.dex */
public final class hoa implements wfd {
    public static final Logger a = Logger.getLogger(hoa.class.getName());
    public static final byte[] b = {0};
    public static final hoa c = new hoa();

    @Override // defpackage.wfd
    public final Class a() {
        return doa.class;
    }

    @Override // defpackage.wfd
    public final Class b() {
        return doa.class;
    }

    @Override // defpackage.wfd
    public final Object c(lrb lrbVar) throws GeneralSecurityException {
        Iterator it = ((ConcurrentMap) lrbVar.F).values().iterator();
        while (it.hasNext()) {
            for (sfd sfdVar : (List) it.next()) {
                ybi ybiVar = sfdVar.h;
                if (ybiVar instanceof foa) {
                    foa foaVar = (foa) ybiVar;
                    byte[] bArr = sfdVar.c;
                    n22 n22VarA = n22.a(bArr == null ? null : Arrays.copyOf(bArr, bArr.length));
                    if (!n22VarA.equals(foaVar.v())) {
                        StringBuilder sb = new StringBuilder("Mac Key with parameters ");
                        sb.append(foaVar.w());
                        n22 n22VarV = foaVar.v();
                        sb.append(" has wrong output prefix (");
                        sb.append(n22VarV);
                        sb.append(") instead of (");
                        sb.append(n22VarA);
                        sb.append(")");
                        throw new GeneralSecurityException(sb.toString());
                    }
                }
            }
        }
        return new goa(lrbVar);
    }
}
