package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class exj {
    public static ixi a(qh9 qh9Var) {
        try {
            bh9 bh9VarS = qh9Var.s("id");
            String strM = bh9VarS != null ? bh9VarS.m() : null;
            bh9 bh9VarS2 = qh9Var.s("name");
            String strM2 = bh9VarS2 != null ? bh9VarS2.m() : null;
            bh9 bh9VarS3 = qh9Var.s("email");
            String strM3 = bh9VarS3 != null ? bh9VarS3.m() : null;
            bh9 bh9VarS4 = qh9Var.s("anonymous_id");
            String strM4 = bh9VarS4 != null ? bh9VarS4.m() : null;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = ((m7a) qh9Var.E.entrySet()).iterator();
            while (((o7a) it).hasNext()) {
                p7a p7aVarA = ((l7a) it).a();
                if (!mp0.o0(p7aVarA.getKey(), ixi.f)) {
                    Object key = p7aVarA.getKey();
                    key.getClass();
                    linkedHashMap.put(key, p7aVarA.getValue());
                }
            }
            return new ixi(strM, strM2, strM3, strM4, linkedHashMap);
        } catch (IllegalStateException e) {
            pmf.j("Unable to parse json into type Usr", e);
            return null;
        } catch (NullPointerException e2) {
            pmf.j("Unable to parse json into type Usr", e2);
            return null;
        } catch (NumberFormatException e3) {
            pmf.j("Unable to parse json into type Usr", e3);
            return null;
        }
    }

    public static int b(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }
}
