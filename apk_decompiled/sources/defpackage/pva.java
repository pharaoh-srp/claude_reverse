package defpackage;

import java.io.Serializable;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public final class pva {
    public final /* synthetic */ int a;
    public final Serializable b;

    public /* synthetic */ pva(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    public final boolean a(CharSequence charSequence) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return ((String) serializable).contentEquals(charSequence);
            default:
                return ((Pattern) serializable).matcher(charSequence).matches();
        }
    }

    public final boolean b(String str) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return ((String) serializable).equals(str);
            default:
                return ((Pattern) serializable).matcher(str).matches();
        }
    }
}
