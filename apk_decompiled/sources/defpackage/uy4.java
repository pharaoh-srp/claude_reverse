package defpackage;

import android.net.Uri;
import com.anthropic.claude.conway.f;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class uy4 extends m08 implements rz7 {
    public final /* synthetic */ int E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uy4(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.E = i3;
    }

    @Override // defpackage.rz7
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                Uri uri = (Uri) obj;
                uri.getClass();
                ((f) this.receiver).x0(uri, (String) obj2, (String) obj3);
                break;
            default:
                Uri uri2 = (Uri) obj;
                uri2.getClass();
                ((f) this.receiver).x0(uri2, (String) obj2, (String) obj3);
                break;
        }
        return ieiVar;
    }
}
