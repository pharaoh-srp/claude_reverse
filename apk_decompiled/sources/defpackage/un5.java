package defpackage;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes2.dex */
public final class un5 {
    public Integer a;

    public final Integer a(KeyEvent keyEvent) {
        int iK = ssj.k(keyEvent);
        if ((Integer.MIN_VALUE & iK) != 0) {
            this.a = Integer.valueOf(iK & Integer.MAX_VALUE);
            return null;
        }
        Integer num = this.a;
        if (num == null) {
            return Integer.valueOf(iK);
        }
        this.a = null;
        int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), iK);
        Integer numValueOf = deadChar != 0 ? Integer.valueOf(deadChar) : null;
        if (numValueOf != null) {
            iK = numValueOf.intValue();
        }
        return Integer.valueOf(iK);
    }
}
