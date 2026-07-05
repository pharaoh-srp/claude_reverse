package defpackage;

import com.anthropic.claude.types.strings.TaskId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class s5h extends gb9 {
    public final /* synthetic */ int c;
    public final /* synthetic */ aid d;
    public final /* synthetic */ String e;

    public /* synthetic */ s5h(aid aidVar, String str, int i) {
        this.c = i;
        this.d = aidVar;
        this.e = str;
    }

    @Override // defpackage.gb9
    public final void E(m4e m4eVar) {
        int i = this.c;
        aid aidVar = this.d;
        sfa sfaVar = sfa.DEBUG;
        String str = this.e;
        switch (i) {
            case 0:
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String strI = ij0.i("stream closed normally for ", TaskId.m1133toStringimpl(str));
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "TaskEventsSse", strI);
                        }
                    }
                }
                aidVar.m(null);
                break;
            default:
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList2.add(obj2);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        String strI2 = ij0.i("stream closed normally for ", TaskId.m1133toStringimpl(str));
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, "TaskSse", strI2);
                        }
                    }
                }
                aidVar.m(null);
                break;
        }
    }

    @Override // defpackage.gb9
    public final void F(m4e m4eVar, String str, String str2) {
        int i = this.c;
        aid aidVar = this.d;
        switch (i) {
            case 0:
                aidVar.r(new cpc(str, str2));
                break;
            default:
                aidVar.r(new cpc(str, str2));
                break;
        }
    }

    @Override // defpackage.gb9
    public final void G(m4e m4eVar, Exception exc, pqe pqeVar) {
        int i = this.c;
        aid aidVar = this.d;
        String str = this.e;
        sfa sfaVar = sfa.WARN;
        switch (i) {
            case 0:
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList = yfa.b;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : copyOnWriteArrayList) {
                        ((n30) ((zfa) obj)).getClass();
                        arrayList.add(obj);
                    }
                    if (!arrayList.isEmpty()) {
                        zfa.a.getClass();
                        String str2 = "stream failure for " + TaskId.m1133toStringimpl(str) + ": http=" + (pqeVar != null ? Integer.valueOf(pqeVar.H) : null) + " t=" + (exc != null ? gsk.c(exc) : null);
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((n30) ((zfa) it.next())).b(sfaVar, "TaskEventsSse", str2);
                        }
                    }
                }
                aidVar.m(null);
                break;
            default:
                zfa.a.getClass();
                if (yfa.b()) {
                    CopyOnWriteArrayList copyOnWriteArrayList2 = yfa.b;
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj2 : copyOnWriteArrayList2) {
                        ((n30) ((zfa) obj2)).getClass();
                        arrayList2.add(obj2);
                    }
                    if (!arrayList2.isEmpty()) {
                        zfa.a.getClass();
                        String str3 = "stream failure for " + TaskId.m1133toStringimpl(str) + ": http=" + (pqeVar != null ? Integer.valueOf(pqeVar.H) : null) + " t=" + (exc != null ? gsk.c(exc) : null);
                        Iterator it2 = arrayList2.iterator();
                        while (it2.hasNext()) {
                            ((n30) ((zfa) it2.next())).b(sfaVar, "TaskSse", str3);
                        }
                    }
                }
                aidVar.m(null);
                break;
        }
    }
}
