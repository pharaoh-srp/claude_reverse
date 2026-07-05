package defpackage;

import com.anthropic.claude.api.project.Project;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface nkd {
    Object a(vp4 vp4Var, String str, boolean z);

    Project b(String str);

    void c(kmd kmdVar, List list, vp4 vp4Var);

    default Object d(String str, tp4 tp4Var) {
        return b(str);
    }

    Object e(kmd kmdVar, List list, vp4 vp4Var);

    Object f(Project project, vp4 vp4Var);

    default Object g(kmd kmdVar, tp4 tp4Var) {
        return iei.a;
    }

    Object h(kmd kmdVar, String str, vp4 vp4Var);

    Object i(String str, vp4 vp4Var);

    kdg j(kmd kmdVar);
}
