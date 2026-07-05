package defpackage;

import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: loaded from: classes.dex */
public final class hk5 implements zy7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ m7f F;

    public /* synthetic */ hk5(m7f m7fVar, int i) {
        this.E = i;
        this.F = m7fVar;
    }

    @Override // defpackage.zy7
    public final Object a() {
        int i = this.E;
        m7f m7fVar = this.F;
        switch (i) {
            case 0:
                return m7fVar.a(jce.a.b(m78.class), null, null);
            case 1:
                return m7fVar.a(jce.a.b(FirebaseMessaging.class), null, null);
            case 2:
                return m7fVar.a(jce.a.b(FirebaseMessaging.class), null, null);
            case 3:
                return m7fVar.a(jce.a.b(m78.class), null, null);
            default:
                return m7fVar.a(jce.a.b(b0f.class), null, null);
        }
    }
}
