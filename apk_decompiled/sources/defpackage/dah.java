package defpackage;

import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import com.anthropic.claude.types.strings.TaskId;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class dah implements bz7 {
    public static final dah F = new dah(0);
    public static final dah G = new dah(1);
    public static final dah H = new dah(2);
    public static final dah I = new dah(3);
    public static final dah J = new dah(4);
    public static final dah K = new dah(5);
    public static final dah L = new dah(6);
    public static final dah M = new dah(7);
    public static final dah N = new dah(8);
    public final /* synthetic */ int E;

    public dah(ii7 ii7Var) {
        this.E = 9;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        List list;
        int i = this.E;
        iei ieiVar = iei.a;
        switch (i) {
            case 0:
                List list2 = (List) obj;
                list2.getClass();
                list = list2.size() > 1 ? list2 : null;
                return list != null ? w44.J0(1, list) : list2;
            case 1:
                ((TaskId) obj).m1134unboximpl().getClass();
                return ieiVar;
            case 2:
                List list3 = (List) obj;
                list3.getClass();
                list = list3.size() > 1 ? list3 : null;
                return list != null ? w44.J0(1, list) : list3;
            case 3:
                ((uub) obj).getClass();
                return null;
            case 4:
                ((ImageGalleryItemId) obj).m310unboximpl().getClass();
                wjk.p("onOpenImageGallery");
                return ieiVar;
            case 5:
                return Boolean.valueOf(obj instanceof zj6);
            case 6:
                return Boolean.valueOf(obj instanceof zj6);
            case 7:
                return Boolean.valueOf(obj instanceof zj6);
            case 8:
                return Boolean.valueOf(obj instanceof zj6);
            case 9:
                x5a x5aVar = (x5a) obj;
                x5aVar.getClass();
                x5aVar.c.setValue(Boolean.TRUE);
                return ieiVar;
            case 10:
                return (e92) obj;
            case 11:
                return (e92) obj;
            default:
                if (((ww7) obj) != null) {
                    return Boolean.valueOf(!r4.equals(okg.y));
                }
                sz6.p("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
        }
    }

    public /* synthetic */ dah(int i) {
        this.E = i;
    }
}
