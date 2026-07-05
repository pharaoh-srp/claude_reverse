package defpackage;

import com.anthropic.claude.analytics.events.SearchEvents$ImageSearchResultClicked;
import com.anthropic.claude.api.chat.tool.ImageGalleryItem;
import com.anthropic.claude.api.chat.tool.ImageGalleryItemId;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class fy8 implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ String F;
    public final /* synthetic */ nwb G;
    public final /* synthetic */ l45 H;
    public final /* synthetic */ lvh I;
    public final /* synthetic */ dxh J;

    public /* synthetic */ fy8(dxh dxhVar, String str, nwb nwbVar, l45 l45Var, lvh lvhVar, int i) {
        this.E = i;
        this.J = dxhVar;
        this.F = str;
        this.G = nwbVar;
        this.H = l45Var;
        this.I = lvhVar;
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        Object next;
        Object next2;
        int i = this.E;
        iei ieiVar = iei.a;
        lvh lvhVar = this.I;
        l45 l45Var = this.H;
        String str = this.F;
        int i2 = -1;
        dxh dxhVar = this.J;
        nwb nwbVar = this.G;
        int i3 = 0;
        switch (i) {
            case 0:
                List list = (List) obj;
                String strM310unboximpl = ((ImageGalleryItemId) obj2).m310unboximpl();
                list.getClass();
                strM310unboximpl.getClass();
                gy8 gy8Var = (gy8) dxhVar;
                qi3 qi3Var = gy8Var.h;
                Iterator it = list.iterator();
                int i4 = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) it.next()).m303getIdivCCbqw(), strM310unboximpl)) {
                            i2 = i4;
                        } else {
                            i4++;
                        }
                    }
                }
                int size = list.size();
                Iterator it2 = list.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        next = it2.next();
                        if (ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) next).m303getIdivCCbqw(), strM310unboximpl)) {
                        }
                    } else {
                        next = null;
                    }
                }
                ImageGalleryItem imageGalleryItem = (ImageGalleryItem) next;
                qi3Var.e(new SearchEvents$ImageSearchResultClicked(i2, size, imageGalleryItem != null ? imageGalleryItem.getTelemetry() : null), SearchEvents$ImageSearchResultClicked.Companion.serializer());
                gy8Var.f.c(str, strM310unboximpl, list);
                lf9 lf9Var = (lf9) nwbVar.getValue();
                if (lf9Var != null) {
                    lf9Var.d(null);
                }
                nwbVar.setValue(gb9.D(l45Var, null, null, new ey8(lvhVar, strM310unboximpl, null, 0), 3));
                break;
            default:
                List list2 = (List) obj;
                String strM310unboximpl2 = ((ImageGalleryItemId) obj2).m310unboximpl();
                list2.getClass();
                strM310unboximpl2.getClass();
                gy8 gy8Var2 = (gy8) dxhVar;
                qi3 qi3Var2 = gy8Var2.h;
                Iterator it3 = list2.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        if (ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) it3.next()).m303getIdivCCbqw(), strM310unboximpl2)) {
                            i2 = i3;
                        } else {
                            i3++;
                        }
                    }
                }
                int size2 = list2.size();
                Iterator it4 = list2.iterator();
                while (true) {
                    if (it4.hasNext()) {
                        next2 = it4.next();
                        if (ImageGalleryItemId.m307equalsimpl0(((ImageGalleryItem) next2).m303getIdivCCbqw(), strM310unboximpl2)) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                ImageGalleryItem imageGalleryItem2 = (ImageGalleryItem) next2;
                qi3Var2.e(new SearchEvents$ImageSearchResultClicked(i2, size2, imageGalleryItem2 != null ? imageGalleryItem2.getTelemetry() : null), SearchEvents$ImageSearchResultClicked.Companion.serializer());
                gy8Var2.f.c(str, strM310unboximpl2, list2);
                lf9 lf9Var2 = (lf9) nwbVar.getValue();
                if (lf9Var2 != null) {
                    lf9Var2.d(null);
                }
                nwbVar.setValue(gb9.D(l45Var, null, null, new ey8(lvhVar, strM310unboximpl2, null, 1), 3));
                break;
        }
        return ieiVar;
    }
}
