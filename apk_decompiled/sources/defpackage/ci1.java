package defpackage;

import com.anthropic.claude.api.chat.MessageFile;
import com.anthropic.claude.bell.api.BellApiClientMessage;
import com.anthropic.claude.types.strings.FileId;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes2.dex */
public final class ci1 {
    public final String a;
    public final ej1 b;
    public final pt2 c;
    public final g09 d;
    public final l45 e;
    public final lsc f;
    public final zy1 g;
    public final ih2 h;

    public ci1(String str, ej1 ej1Var, pt2 pt2Var, g09 g09Var, mp4 mp4Var) {
        str.getClass();
        mp4Var.getClass();
        this.a = str;
        this.b = ej1Var;
        this.c = pt2Var;
        this.d = g09Var;
        this.e = mp4Var;
        this.f = mpk.P(Boolean.FALSE);
        zy1 zy1VarP = wd6.P(-2, 6, null);
        this.g = zy1VarP;
        this.h = j8.b0(zy1VarP);
    }

    public final void a() {
        pt2 pt2Var = this.c;
        boolean zBooleanValue = ((Boolean) pt2Var.l.getValue()).booleanValue();
        boolean zBooleanValue2 = ((Boolean) pt2Var.m.getValue()).booleanValue();
        zy1 zy1Var = this.g;
        if (!zBooleanValue && zBooleanValue2) {
            zy1Var.r(zh1.a);
        }
        if (zBooleanValue2) {
            ArrayList arrayListF = pt2Var.f();
            ArrayList arrayList = new ArrayList(x44.y(arrayListF, 10));
            Iterator it = arrayListF.iterator();
            while (it.hasNext()) {
                arrayList.add(FileId.m1014boximpl(((MessageFile) it.next()).mo236getFile_uuidExWXDbg()));
            }
            this.b.b(new BellApiClientMessage.AttachmentFlowEnd(new BellApiClientMessage.AttachmentFlowEnd.Data(arrayList, pt2Var.e())));
            pt2Var.a.h();
            this.f.setValue(Boolean.FALSE);
            zy1Var.r(ai1.a);
        }
    }
}
