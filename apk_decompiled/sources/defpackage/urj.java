package defpackage;

import com.google.firebase.encoders.EncodingException;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class urj implements tac {
    public static final /* synthetic */ urj b = new urj(0);
    public static final /* synthetic */ urj c = new urj(1);
    public static final /* synthetic */ urj d = new urj(2);
    public static final /* synthetic */ urj e = new urj(3);
    public final /* synthetic */ int a;

    public /* synthetic */ urj(int i) {
        this.a = i;
    }

    @Override // defpackage.cn6
    public final void a(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                uac uacVar = (uac) obj2;
                uacVar.a(zrj.g, entry.getKey());
                uacVar.a(zrj.h, entry.getValue());
                return;
            case 1:
                Map.Entry entry2 = (Map.Entry) obj;
                uac uacVar2 = (uac) obj2;
                uacVar2.a(esj.g, entry2.getKey());
                uacVar2.a(esj.h, entry2.getValue());
                return;
            case 2:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
            default:
                throw new EncodingException("Couldn't find encoder for type ".concat(String.valueOf(obj.getClass().getCanonicalName())));
        }
    }
}
