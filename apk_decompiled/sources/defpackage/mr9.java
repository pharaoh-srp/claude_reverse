package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.anthropic.claude.api.project.Project;
import com.anthropic.claude.api.project.ProjectPermission;
import com.google.firebase.components.DependencyException;
import io.sentry.f1;
import io.sentry.j4;
import io.sentry.s7;
import io.sentry.t4;
import io.sentry.v6;
import io.sentry.y;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mr9 implements d52, ka6, qze, j4, v6 {
    public static /* synthetic */ void b() {
        throw new NoWhenBranchMatchedException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void c(int i, Object obj, String str) {
        throw new IllegalArgumentException(str + obj + ((char) i));
    }

    public static /* synthetic */ void d(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void e(int i, StringBuilder sb) {
        sb.append(i);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void f(Object obj) {
        throw new IllegalStateException(obj.toString());
    }

    public static /* synthetic */ void g(Object obj, Object obj2, String str) {
        throw new AssertionError(str + obj + obj2);
    }

    public static /* synthetic */ void h(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void j(String str, float f, Object obj, float f2, Object obj2) {
        throw new IllegalArgumentException(str + f + obj + f2 + obj2);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new KotlinReflectionInternalError(str + obj + obj2 + obj3 + ')');
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, int i) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + ((char) i));
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void o() {
        throw new ClassCastException();
    }

    public static /* synthetic */ void p(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void q(Object obj) {
        throw new IllegalArgumentException(obj.toString());
    }

    public static /* synthetic */ void r(Object obj, Object obj2, String str) {
        throw new DependencyException(str + obj + obj2);
    }

    public static /* synthetic */ void s(String str) throws ProtocolException {
        throw new ProtocolException(str);
    }

    public static /* synthetic */ void t(String str, Object obj) {
        throw new IllegalArgumentException((str + obj).toString());
    }

    public static /* synthetic */ void u() {
        throw new AssertionError();
    }

    public static /* synthetic */ void v(int i, String str) {
        throw new IllegalStateException((str + i).toString());
    }

    public static /* synthetic */ void w(String str, Object obj) {
        throw new IllegalStateException((str + obj + '\'').toString());
    }

    public static /* synthetic */ void x() {
        throw new UnsupportedOperationException();
    }

    public static /* synthetic */ void y() {
        throw new IllegalArgumentException();
    }

    @Override // defpackage.ka6
    public double a(double d) {
        return d;
    }

    @Override // defpackage.qze
    public Object apply(Object obj) {
        Cursor cursorRawQuery = ((SQLiteDatabase) obj).rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
        try {
            ArrayList arrayList = new ArrayList();
            while (cursorRawQuery.moveToNext()) {
                fj0 fj0VarA = g91.a();
                fj0VarA.J(cursorRawQuery.getString(1));
                fj0VarA.G = bgd.b(cursorRawQuery.getInt(2));
                String string = cursorRawQuery.getString(3);
                fj0VarA.F = string == null ? null : Base64.decode(string, 0);
                arrayList.add(fj0VarA.h());
            }
            return arrayList;
        } finally {
            cursorRawQuery.close();
        }
    }

    @Override // io.sentry.j4
    public void i(f1 f1Var) {
        f1Var.getClass();
        f1Var.I();
    }

    @Override // defpackage.d52
    public Object invoke(Object obj, Object obj2) {
        Project project = (Project) obj;
        Project project2 = (Project) obj2;
        project2.getClass();
        if (project == null) {
            return project2;
        }
        String prompt_template = project2.getPrompt_template();
        if (prompt_template == null) {
            prompt_template = project.getPrompt_template();
        }
        String str = prompt_template;
        Integer docs_count = project2.getDocs_count();
        if (docs_count == null) {
            docs_count = project.getDocs_count();
        }
        Integer num = docs_count;
        Integer files_count = project2.getFiles_count();
        if (files_count == null) {
            files_count = project.getFiles_count();
        }
        Integer num2 = files_count;
        List<ProjectPermission> permissions = project2.getPermissions();
        if (permissions == null) {
            permissions = project.getPermissions();
        }
        return Project.m401copyqeyL9fA$default(project2, null, null, null, false, null, null, null, null, null, false, false, null, null, str, num, num2, permissions, 8191, null);
    }

    public Double z(y yVar) {
        z9e z9eVar = new z9e();
        t4.e(new cd(9, z9eVar));
        if (z9eVar.E) {
            return Double.valueOf(1.0d);
        }
        s7 s7Var = (s7) yVar.F;
        s7Var.getClass();
        if (!x44.r(s7Var.M, "auto.ui.activity")) {
            return null;
        }
        String str = s7Var.T;
        str.getClass();
        String str2 = s7Var.I;
        str2.getClass();
        if (str.equals("MainActivity") && str2.equals("ui.load")) {
            return Double.valueOf(0.00125d);
        }
        return null;
    }
}
