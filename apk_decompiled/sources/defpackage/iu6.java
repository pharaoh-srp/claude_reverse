package defpackage;

import android.os.RemoteException;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public abstract class iu6 {
    public static final Map a;

    static {
        kce kceVar = jce.a;
        a = sta.h0(new cpc(1, kceVar.b(UnsupportedOperationException.class)), new cpc(2, kceVar.b(UnsupportedOperationException.class)), new cpc(3, kceVar.b(UnsupportedOperationException.class)), new cpc(4, kceVar.b(SecurityException.class)), new cpc(Integer.valueOf(yr6.INVALID_OWNERSHIP), kceVar.b(SecurityException.class)), new cpc(Integer.valueOf(yr6.NOT_ALLOWED), kceVar.b(SecurityException.class)), new cpc(Integer.valueOf(yr6.EMPTY_PERMISSION_LIST), kceVar.b(IllegalArgumentException.class)), new cpc(Integer.valueOf(yr6.PERMISSION_NOT_DECLARED), kceVar.b(SecurityException.class)), new cpc(Integer.valueOf(yr6.INVALID_PERMISSION_RATIONALE_DECLARATION), kceVar.b(SecurityException.class)), new cpc(Integer.valueOf(yr6.INVALID_UID), kceVar.b(RemoteException.class)), new cpc(Integer.valueOf(yr6.DATABASE_ERROR), kceVar.b(IOException.class)), new cpc(Integer.valueOf(yr6.INTERNAL_ERROR), kceVar.b(RemoteException.class)), new cpc(Integer.valueOf(yr6.CHANGES_TOKEN_OUTDATED), kceVar.b(RemoteException.class)), new cpc(Integer.valueOf(yr6.TRANSACTION_TOO_LARGE), kceVar.b(RemoteException.class)));
    }

    public static final Exception a(hu6 hu6Var) {
        String str = hu6Var.G;
        pl9 pl9Var = (pl9) a.get(Integer.valueOf(hu6Var.F));
        if (pl9Var == null) {
            return new UnsupportedOperationException(str);
        }
        kce kceVar = jce.a;
        return pl9Var.equals(kceVar.b(SecurityException.class)) ? new SecurityException(str) : pl9Var.equals(kceVar.b(RemoteException.class)) ? new RemoteException(str) : pl9Var.equals(kceVar.b(IllegalArgumentException.class)) ? new IllegalArgumentException(str) : pl9Var.equals(kceVar.b(IOException.class)) ? new IOException(str) : new UnsupportedOperationException(str);
    }
}
