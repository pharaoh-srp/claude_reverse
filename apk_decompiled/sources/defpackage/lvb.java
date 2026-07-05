package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class lvb implements iub {
    public final List E;
    public final List F;
    public final wz5 G;
    public final wz5 H;

    public lvb(List list) {
        this.E = list;
        this.F = list;
        final int i = 0;
        this.G = mpk.w(new zy7(this) { // from class: kvb
            public final /* synthetic */ lvb F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i2 = i;
                boolean z = false;
                lvb lvbVar = this.F;
                switch (i2) {
                    case 0:
                        List list2 = lvbVar.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!x44.r(((wxc) obj).e(), yxc.a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = lvbVar.F;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!oq5.I(((wxc) it.next()).e())) {
                                        if (((List) lvbVar.G.getValue()).isEmpty()) {
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list4 = lvbVar.F;
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (oq5.D(((wxc) it2.next()).e())) {
                                        List<wxc> list6 = list4;
                                        if ((list6 instanceof Collection) && list6.isEmpty()) {
                                            z = true;
                                        } else {
                                            for (wxc wxcVar : list6) {
                                                if (oq5.I(wxcVar.e()) || oq5.D(wxcVar.e())) {
                                                }
                                            }
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.H = mpk.w(new zy7(this) { // from class: kvb
            public final /* synthetic */ lvb F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i2;
                boolean z = false;
                lvb lvbVar = this.F;
                switch (i22) {
                    case 0:
                        List list2 = lvbVar.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!x44.r(((wxc) obj).e(), yxc.a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = lvbVar.F;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!oq5.I(((wxc) it.next()).e())) {
                                        if (((List) lvbVar.G.getValue()).isEmpty()) {
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list4 = lvbVar.F;
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (oq5.D(((wxc) it2.next()).e())) {
                                        List<wxc> list6 = list4;
                                        if ((list6 instanceof Collection) && list6.isEmpty()) {
                                            z = true;
                                        } else {
                                            for (wxc wxcVar : list6) {
                                                if (oq5.I(wxcVar.e()) || oq5.D(wxcVar.e())) {
                                                }
                                            }
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i3 = 2;
        mpk.w(new zy7(this) { // from class: kvb
            public final /* synthetic */ lvb F;

            {
                this.F = this;
            }

            @Override // defpackage.zy7
            public final Object a() {
                int i22 = i3;
                boolean z = false;
                lvb lvbVar = this.F;
                switch (i22) {
                    case 0:
                        List list2 = lvbVar.F;
                        ArrayList arrayList = new ArrayList();
                        for (Object obj : list2) {
                            if (!x44.r(((wxc) obj).e(), yxc.a)) {
                                arrayList.add(obj);
                            }
                        }
                        return arrayList;
                    case 1:
                        List list3 = lvbVar.F;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            z = true;
                        } else {
                            Iterator it = list3.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (!oq5.I(((wxc) it.next()).e())) {
                                        if (((List) lvbVar.G.getValue()).isEmpty()) {
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                    default:
                        List list4 = lvbVar.F;
                        List list5 = list4;
                        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
                            Iterator it2 = list5.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (oq5.D(((wxc) it2.next()).e())) {
                                        List<wxc> list6 = list4;
                                        if ((list6 instanceof Collection) && list6.isEmpty()) {
                                            z = true;
                                        } else {
                                            for (wxc wxcVar : list6) {
                                                if (oq5.I(wxcVar.e()) || oq5.D(wxcVar.e())) {
                                                }
                                            }
                                            z = true;
                                        }
                                    }
                                }
                            }
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
    }

    @Override // defpackage.iub
    public final boolean j() {
        return ((Boolean) this.H.getValue()).booleanValue();
    }
}
