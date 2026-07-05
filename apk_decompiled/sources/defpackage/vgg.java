package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
public class vgg {
    public static final vgg F;
    public static final vgg G;
    public static final vgg H;
    public static final ugg I;
    public static final /* synthetic */ vgg[] J;
    public final Object E;

    static {
        vgg vggVar = new vgg(0, null, "NULL");
        F = vggVar;
        vgg vggVar2 = new vgg(1, -1, "INDEX");
        G = vggVar2;
        vgg vggVar3 = new vgg(2, Boolean.FALSE, "FALSE");
        H = vggVar3;
        ugg uggVar = new ugg(3, null, "MAP_GET_OR_DEFAULT");
        I = uggVar;
        J = new vgg[]{vggVar, vggVar2, vggVar3, uggVar};
    }

    public vgg(int i, Object obj, String str) {
        this.E = obj;
    }

    public static vgg valueOf(String str) {
        return (vgg) Enum.valueOf(vgg.class, str);
    }

    public static vgg[] values() {
        return (vgg[]) J.clone();
    }
}
