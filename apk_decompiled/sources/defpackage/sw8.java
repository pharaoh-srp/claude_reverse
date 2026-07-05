package defpackage;

import android.app.Activity;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes2.dex */
public final class sw8 implements v86 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sw8(Object obj, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = i;
    }

    @Override // defpackage.v86
    public final void a() {
        int i = this.a;
        int i2 = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                gw8 gw8Var = (gw8) obj;
                if (i2 == gw8Var.f) {
                    fj0 fj0Var = gw8Var.a;
                    fj0Var.getClass();
                    zcg zcgVar = ((mdg) fj0Var.G).H;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    Iterator it = zcgVar.iterator();
                    while (((hmg) it).hasNext()) {
                        Object next = ((hmg) it).next();
                        ((ImageGalleryItemId) ((bz7) fj0Var.E).invoke(next)).m310unboximpl().getClass();
                        ((ImageGalleryItem) next).getClass();
                        linkedHashSet.add(next);
                    }
                    zcgVar.removeAll(linkedHashSet);
                    gw8Var.b.setValue(null);
                    gw8Var.c.setValue(null);
                    gw8Var.d.setValue(Boolean.FALSE);
                    gw8Var.d(false);
                    break;
                }
                break;
            default:
                ((Activity) obj).setRequestedOrientation(i2);
                break;
        }
    }
}
