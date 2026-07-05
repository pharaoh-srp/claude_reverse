package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yud implements tac {
    public final /* synthetic */ int a;

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                uac uacVar = (uac) obj2;
                uacVar.a(zud.g, entry.getKey());
                uacVar.a(zud.h, entry.getValue());
                return;
            default:
                throw new EncodingException("Couldn't find encoder for type " + obj.getClass().getCanonicalName());
        }
    }
}
