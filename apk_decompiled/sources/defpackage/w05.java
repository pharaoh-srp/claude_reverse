package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
public final class w05 {
    public HashMap a;

    public w05(int i) {
        switch (i) {
            case 1:
                this.a = new HashMap(32);
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }
}
