package defpackage;

import com.anthropic.claude.sessions.types.AskUserQuestionInput;
import com.anthropic.claude.sessions.types.AskUserQuestionQuestion;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ow0 {
    public static final ih9 a;

    static {
        nnf nnfVar = hof.a;
        nnfVar.getClass();
        a = u00.c(new a2(18, nnfVar));
    }

    public static final AskUserQuestionInput a(Map map) {
        map.getClass();
        try {
            JsonElement jsonElement = (JsonElement) map.get("questions");
            if (jsonElement != null) {
                ih9 ih9Var = a;
                List list = (List) ih9Var.a(d4c.t(AskUserQuestionQuestion.Companion.serializer()), jsonElement);
                JsonElement jsonElement2 = (JsonElement) map.get("answers");
                return new AskUserQuestionInput(list, jsonElement2 != null ? (Map) ih9Var.a(d4c.u(srg.a, JsonElement.INSTANCE.serializer()), jsonElement2) : null);
            }
        } catch (Exception unused) {
        }
        return null;
    }
}
