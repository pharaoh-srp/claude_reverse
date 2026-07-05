package defpackage;

import coil3.compose.AsyncImagePainter$State$Error;
import com.anthropic.claude.api.tasks.ApproveTaskAgentOverrides;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class shf implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ nwb F;

    public /* synthetic */ shf(int i, nwb nwbVar) {
        this.E = i;
        this.F = nwbVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        iei ieiVar = iei.a;
        nwb nwbVar = this.F;
        switch (i) {
            case 0:
                nwbVar.setValue((ohf) obj);
                break;
            case 1:
                String str = (String) obj;
                str.getClass();
                nwbVar.setValue(str);
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                nwbVar.setValue(bool);
                break;
            case 3:
                String str2 = (String) obj;
                str2.getClass();
                nwbVar.setValue(str2);
                break;
            case 4:
                String str3 = (String) obj;
                str3.getClass();
                nwbVar.setValue(str3);
                break;
            case 5:
                Set set = (Set) obj;
                set.getClass();
                nwbVar.setValue(set);
                break;
            case 6:
                ApproveTaskAgentOverrides approveTaskAgentOverrides = (ApproveTaskAgentOverrides) obj;
                approveTaskAgentOverrides.getClass();
                nwbVar.setValue(approveTaskAgentOverrides);
                break;
            case 7:
                ((bz7) nwbVar.getValue()).invoke((fcc) obj);
                break;
            case 8:
                ((AsyncImagePainter$State$Error) obj).getClass();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 9:
                nwbVar.setValue((cu9) obj);
                break;
            case 10:
                nwbVar.setValue(new fcc(((cu9) obj).q(0L)));
                break;
            case 11:
                ((Boolean) obj).getClass();
                nwbVar.setValue(Boolean.TRUE);
                break;
            case 12:
                g4j g4jVar = (g4j) obj;
                g4jVar.getClass();
                nwbVar.setValue(g4jVar);
                break;
            case 13:
                cjh cjhVar = (cjh) obj;
                cjhVar.getClass();
                nwbVar.setValue(cjhVar);
                break;
            default:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                nwbVar.setValue(bool2);
                break;
        }
        return ieiVar;
    }
}
