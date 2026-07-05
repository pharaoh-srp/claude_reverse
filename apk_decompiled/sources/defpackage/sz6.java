package defpackage;

import androidx.health.platform.client.proto.g;
import com.agog.mathdisplay.MathDisplayLogger;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.chat.ProjectReference;
import com.anthropic.claude.application.ClaudeApplication;
import com.anthropic.claude.core.telemetry.SilentException;
import com.google.firebase.components.ComponentRegistrar;
import java.io.EOFException;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.List;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlinx.serialization.UnknownFieldException;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class sz6 implements io0, MathDisplayLogger, ka6, ka4, d52, ia4 {
    public static final sz6 F = new sz6(0);
    public final /* synthetic */ int E;

    public /* synthetic */ sz6(int i) {
        this.E = i;
    }

    public static /* synthetic */ void c() {
        throw new ConcurrentModificationException();
    }

    public static void e(int i) {
        throw new UnknownFieldException(grc.p(i, "An unknown field for index "));
    }

    public static /* synthetic */ void f(int i, Object obj) {
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append((Object) "#read(byte[]) returned invalid result: ");
        sb.append(i);
        sb.append((Object) "\nThe InputStream implementation is buggy.");
        throw new IllegalStateException(sb.toString());
    }

    public static /* synthetic */ void g(int i, Object obj, int i2) {
        StringBuilder sb = new StringBuilder(i);
        sb.append(obj);
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public static /* synthetic */ void h(Object obj) {
        throw new AssertionError(obj);
    }

    public static /* synthetic */ void i(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void j(String str) {
        throw new IllegalStateException(str);
    }

    public static /* synthetic */ void k(String str, Object obj) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void l(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3).toString());
    }

    public static /* synthetic */ void m(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void n() throws EOFException {
        throw new EOFException();
    }

    public static /* synthetic */ void o(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void p(String str) {
        throw new IllegalArgumentException(str);
    }

    public static /* synthetic */ void q(String str, Object obj) throws IOException {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void r() {
        throw new KotlinNothingValueException();
    }

    @Override // defpackage.ka6
    public double a(double d) {
        switch (this.E) {
            case 14:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case g.SERIES_VALUES_FIELD_NUMBER /* 15 */:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 16:
                float[] fArr = t54.a;
                return t54.b(t54.c, d);
            case g.MAX_FIELD_NUMBER /* 17 */:
                float[] fArr2 = t54.a;
                return t54.a(t54.c, d);
            case g.AVG_FIELD_NUMBER /* 18 */:
                float[] fArr3 = t54.a;
                return t54.d(t54.d, d);
            default:
                float[] fArr4 = t54.a;
                return t54.c(t54.d, d);
        }
    }

    @Override // defpackage.io0
    public int b(int i, fu9 fu9Var) {
        return Math.round((1.0f + (fu9Var == fu9.E ? -1.0f : 1.0f)) * (i / 2.0f));
    }

    @Override // defpackage.ka4
    public List d(ComponentRegistrar componentRegistrar) {
        return componentRegistrar.getComponents();
    }

    @Override // defpackage.d52
    public Object invoke(Object obj, Object obj2) {
        switch (this.E) {
            case 21:
                return obj2;
            default:
                ChatConversationWithProjectReference chatConversationWithProjectReference = (ChatConversationWithProjectReference) obj;
                ChatConversationWithProjectReference chatConversationWithProjectReference2 = (ChatConversationWithProjectReference) obj2;
                chatConversationWithProjectReference2.getClass();
                if (chatConversationWithProjectReference == null) {
                    return chatConversationWithProjectReference2;
                }
                String strM208getProject_uuidvfJkQ = chatConversationWithProjectReference2.m208getProject_uuidvfJkQ();
                if (strM208getProject_uuidvfJkQ == null) {
                    strM208getProject_uuidvfJkQ = chatConversationWithProjectReference.m208getProject_uuidvfJkQ();
                }
                String str = strM208getProject_uuidvfJkQ;
                ProjectReference project = chatConversationWithProjectReference2.getProject();
                if (project == null) {
                    project = chatConversationWithProjectReference.getProject();
                }
                ProjectReference projectReference = project;
                String strM206getCurrent_leaf_message_uuidsaiyK68 = chatConversationWithProjectReference2.m206getCurrent_leaf_message_uuidsaiyK68();
                if (strM206getCurrent_leaf_message_uuidsaiyK68 == null) {
                    strM206getCurrent_leaf_message_uuidsaiyK68 = chatConversationWithProjectReference.m206getCurrent_leaf_message_uuidsaiyK68();
                }
                return ChatConversationWithProjectReference.m200copyu2nbJzk$default(chatConversationWithProjectReference2, null, null, null, null, null, null, null, false, str, projectReference, false, strM206getCurrent_leaf_message_uuidsaiyK68, 1279, null);
        }
    }

    @Override // defpackage.ia4
    public Object s(el5 el5Var) {
        Set setD = el5Var.d(qzd.a(t81.class));
        n78 n78Var = n78.G;
        if (n78Var == null) {
            synchronized (n78.class) {
                try {
                    n78Var = n78.G;
                    if (n78Var == null) {
                        n78Var = new n78(0);
                        n78.G = n78Var;
                    }
                } finally {
                }
            }
        }
        return new pv5(setD, n78Var);
    }

    @Override // com.agog.mathdisplay.MathDisplayLogger
    public void warn(String str) {
        int i = ClaudeApplication.L;
        str.getClass();
        SilentException.a(new SilentException(str), ozf.F, false, 2);
    }
}
