package defpackage;

import androidx.health.platform.client.proto.g;
import com.anthropic.claude.app.ClaudeAppDestination;
import com.anthropic.router.panes.Panes;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class qj3 implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ zqc G;

    public /* synthetic */ qj3(ClaudeAppDestination.List list, zqc zqcVar, int i) {
        this.E = i;
        this.F = list;
        this.G = zqcVar;
    }

    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        int i = this.E;
        Object obj2 = this.F;
        zqc zqcVar = this.G;
        List main = lm6.E;
        ye3 ye3Var = ye3.E;
        switch (i) {
            case 0:
                Panes panes = (Panes) obj;
                panes.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes, x44.W(obj2), ((te3) zqcVar.F.getValue()).d == ye3Var ? main : panes.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes, ((te3) zqcVar.F.getValue()).d == ye3Var ? main : panes.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes, null, null, x44.W(obj2), null, 11, null) : panes;
            case 1:
                Panes panes2 = (Panes) obj;
                lsc lscVar = zqcVar.F;
                panes2.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes2, x44.W(obj2), ((te3) lscVar.getValue()).d == ye3Var ? main : panes2.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes2, ((te3) lscVar.getValue()).d == ye3Var ? main : panes2.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes2, null, null, x44.W(obj2), null, 11, null) : panes2;
            case 2:
                Panes panes3 = (Panes) obj;
                lsc lscVar2 = zqcVar.F;
                panes3.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes3, x44.W(obj2), ((te3) lscVar2.getValue()).d == ye3Var ? main : panes3.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes3, ((te3) lscVar2.getValue()).d == ye3Var ? main : panes3.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes3, null, null, x44.W(obj2), null, 11, null) : panes3;
            case 3:
                Panes panes4 = (Panes) obj;
                lsc lscVar3 = zqcVar.F;
                panes4.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes4, x44.W(obj2), ((te3) lscVar3.getValue()).d == ye3Var ? main : panes4.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes4, ((te3) lscVar3.getValue()).d == ye3Var ? main : panes4.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes4, null, null, x44.W(obj2), null, 11, null) : panes4;
            case 4:
                Panes panes5 = (Panes) obj;
                lsc lscVar4 = zqcVar.F;
                panes5.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes5, x44.W(obj2), ((te3) lscVar4.getValue()).d == ye3Var ? main : panes5.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes5, ((te3) lscVar4.getValue()).d == ye3Var ? main : panes5.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes5, null, null, x44.W(obj2), null, 11, null) : panes5;
            case 5:
                Panes panes6 = (Panes) obj;
                lsc lscVar5 = zqcVar.F;
                panes6.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes6, x44.W(obj2), ((te3) lscVar5.getValue()).d == ye3Var ? main : panes6.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes6, ((te3) lscVar5.getValue()).d == ye3Var ? main : panes6.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes6, null, null, x44.W(obj2), null, 11, null) : panes6;
            case 6:
                Panes panes7 = (Panes) obj;
                lsc lscVar6 = zqcVar.F;
                panes7.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes7, x44.W(obj2), ((te3) lscVar6.getValue()).d == ye3Var ? main : panes7.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes7, ((te3) lscVar6.getValue()).d == ye3Var ? main : panes7.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes7, null, null, x44.W(obj2), null, 11, null) : panes7;
            case 7:
                Panes panes8 = (Panes) obj;
                lsc lscVar7 = zqcVar.F;
                panes8.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes8, x44.W(obj2), ((te3) lscVar7.getValue()).d == ye3Var ? main : panes8.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes8, ((te3) lscVar7.getValue()).d == ye3Var ? main : panes8.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes8, null, null, x44.W(obj2), null, 11, null) : panes8;
            case 8:
                Panes panes9 = (Panes) obj;
                lsc lscVar8 = zqcVar.F;
                panes9.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes9, x44.W(obj2), ((te3) lscVar8.getValue()).d == ye3Var ? main : panes9.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes9, ((te3) lscVar8.getValue()).d == ye3Var ? main : panes9.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes9, null, null, x44.W(obj2), null, 11, null) : panes9;
            case 9:
                Panes panes10 = (Panes) obj;
                lsc lscVar9 = zqcVar.F;
                panes10.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes10, x44.W(obj2), ((te3) lscVar9.getValue()).d == ye3Var ? main : panes10.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes10, ((te3) lscVar9.getValue()).d == ye3Var ? main : panes10.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes10, null, null, x44.W(obj2), null, 11, null) : panes10;
            case 10:
                Panes panes11 = (Panes) obj;
                lsc lscVar10 = zqcVar.F;
                panes11.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes11, x44.W(obj2), ((te3) lscVar10.getValue()).d == ye3Var ? main : panes11.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes11, ((te3) lscVar10.getValue()).d == ye3Var ? main : panes11.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes11, null, null, x44.W(obj2), null, 11, null) : panes11;
            case 11:
                Panes panes12 = (Panes) obj;
                lsc lscVar11 = zqcVar.F;
                panes12.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    return Panes.copy$default(panes12, x44.W(obj2), ((te3) lscVar11.getValue()).d == ye3Var ? main : panes12.getDetails(), null, null, 12, null);
                }
                if (obj2 instanceof ClaudeAppDestination.Detail) {
                    return Panes.copy$default(panes12, ((te3) lscVar11.getValue()).d == ye3Var ? main : panes12.getMain(), x44.W(obj2), null, null, 12, null);
                }
                return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes12, null, null, x44.W(obj2), null, 11, null) : panes12;
            case 12:
                Panes panes13 = (Panes) obj;
                lsc lscVar12 = zqcVar.F;
                panes13.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    List listW = x44.W(obj2);
                    if (((te3) lscVar12.getValue()).d != ye3Var) {
                        main = panes13.getDetails();
                    }
                    return Panes.copy$default(panes13, listW, main, null, null, 12, null);
                }
                if (!(obj2 instanceof ClaudeAppDestination.Detail)) {
                    return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes13, null, null, x44.W(obj2), null, 11, null) : panes13;
                }
                if (((te3) lscVar12.getValue()).d != ye3Var) {
                    main = panes13.getMain();
                }
                return Panes.copy$default(panes13, main, x44.W(obj2), null, null, 12, null);
            case 13:
                Panes panes14 = (Panes) obj;
                lsc lscVar13 = zqcVar.F;
                panes14.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    List listW2 = x44.W(obj2);
                    if (((te3) lscVar13.getValue()).d != ye3Var) {
                        main = panes14.getDetails();
                    }
                    return Panes.copy$default(panes14, listW2, main, null, null, 12, null);
                }
                if (!(obj2 instanceof ClaudeAppDestination.Detail)) {
                    return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes14, null, null, x44.W(obj2), null, 11, null) : panes14;
                }
                if (((te3) lscVar13.getValue()).d != ye3Var) {
                    main = panes14.getMain();
                }
                return Panes.copy$default(panes14, main, x44.W(obj2), null, null, 12, null);
            case 14:
                Panes panes15 = (Panes) obj;
                lsc lscVar14 = zqcVar.F;
                panes15.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    List listW3 = x44.W(obj2);
                    if (((te3) lscVar14.getValue()).d != ye3Var) {
                        main = panes15.getDetails();
                    }
                    return Panes.copy$default(panes15, listW3, main, null, null, 12, null);
                }
                if (!(obj2 instanceof ClaudeAppDestination.Detail)) {
                    return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes15, null, null, x44.W(obj2), null, 11, null) : panes15;
                }
                if (((te3) lscVar14.getValue()).d != ye3Var) {
                    main = panes15.getMain();
                }
                return Panes.copy$default(panes15, main, x44.W(obj2), null, null, 12, null);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                Panes panes16 = (Panes) obj;
                lsc lscVar15 = zqcVar.F;
                panes16.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    List listW4 = x44.W(obj2);
                    if (((te3) lscVar15.getValue()).d != ye3Var) {
                        main = panes16.getDetails();
                    }
                    return Panes.copy$default(panes16, listW4, main, null, null, 12, null);
                }
                if (!(obj2 instanceof ClaudeAppDestination.Detail)) {
                    return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes16, null, null, x44.W(obj2), null, 11, null) : panes16;
                }
                if (((te3) lscVar15.getValue()).d != ye3Var) {
                    main = panes16.getMain();
                }
                return Panes.copy$default(panes16, main, x44.W(obj2), null, null, 12, null);
            default:
                Panes panes17 = (Panes) obj;
                lsc lscVar16 = zqcVar.F;
                panes17.getClass();
                if (obj2 instanceof ClaudeAppDestination.List) {
                    List listW5 = x44.W(obj2);
                    if (((te3) lscVar16.getValue()).d != ye3Var) {
                        main = panes17.getDetails();
                    }
                    return Panes.copy$default(panes17, listW5, main, null, null, 12, null);
                }
                if (!(obj2 instanceof ClaudeAppDestination.Detail)) {
                    return obj2 instanceof ClaudeAppDestination.Extra ? Panes.copy$default(panes17, null, null, x44.W(obj2), null, 11, null) : panes17;
                }
                if (((te3) lscVar16.getValue()).d != ye3Var) {
                    main = panes17.getMain();
                }
                return Panes.copy$default(panes17, main, x44.W(obj2), null, null, 12, null);
        }
    }
}
