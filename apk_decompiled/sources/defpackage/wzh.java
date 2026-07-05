package defpackage;

import android.content.SharedPreferences;
import com.anthropic.claude.api.chat.ChatConversationSettings;
import com.anthropic.claude.api.chat.ChatConversationWithProjectReference;
import com.anthropic.claude.api.mcp.McpServer;
import com.anthropic.claude.types.strings.ChatId;
import com.anthropic.claude.types.strings.McpServerId;
import com.anthropic.claude.types.strings.ResearchMode;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class wzh implements bz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ q0i F;

    public /* synthetic */ wzh(q0i q0iVar, int i) {
        this.E = i;
        this.F = q0iVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.bz7
    public final Object invoke(Object obj) {
        ChatConversationSettings settings;
        ChatConversationSettings settings2;
        ChatConversationSettings settings3;
        ChatConversationSettings settings4;
        ChatConversationSettings settings5;
        ChatConversationSettings settings6;
        int i = this.E;
        Object obj2 = null;
        strM184getCompass_modevlYN4T0 = null;
        String strM184getCompass_modevlYN4T0 = null;
        q0i q0iVar = this.F;
        switch (i) {
            case 0:
                String strM984unboximpl = ((ChatId) obj).m984unboximpl();
                strM984unboximpl.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT = q0iVar.d.e.t(strM984unboximpl);
                if (chatConversationWithProjectReferenceT != null && (settings = chatConversationWithProjectReferenceT.getSettings()) != null) {
                    zR = !x44.r(settings.getPreview_feature_uses_artifacts(), Boolean.FALSE) && x44.r(settings.getEnabled_turmeric(), Boolean.TRUE);
                }
                return Boolean.valueOf(zR);
            case 1:
                String strM984unboximpl2 = ((ChatId) obj).m984unboximpl();
                strM984unboximpl2.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT2 = q0iVar.d.e.t(strM984unboximpl2);
                if (chatConversationWithProjectReferenceT2 != null && (settings2 = chatConversationWithProjectReferenceT2.getSettings()) != null) {
                    zR = x44.r(settings2.getPreview_feature_uses_artifacts(), Boolean.FALSE);
                }
                return Boolean.valueOf(!zR);
            case 2:
                ((ChatId) obj).m984unboximpl().getClass();
                dyh dyhVar = q0iVar.o.f;
                mdg mdgVar = dyhVar.b;
                Object obj3 = mdgVar.get("health_connect");
                Object obj4 = obj3;
                if (obj3 == null) {
                    SharedPreferences sharedPreferences = dyhVar.a;
                    eyh eyhVar = eyh.E;
                    String string = sharedPreferences.getString("health_connect", eyhVar.name());
                    Iterator<E> it = eyh.I.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (x44.r(((eyh) next).name(), string)) {
                                obj2 = next;
                            }
                        }
                    }
                    eyh eyhVar2 = (eyh) obj2;
                    eyh eyhVar3 = eyhVar;
                    if (eyhVar2 != null) {
                        eyhVar3 = eyhVar2;
                    }
                    mdgVar.put("health_connect", eyhVar3);
                    obj4 = eyhVar3;
                }
                return Boolean.valueOf(((eyh) obj4).a());
            case 3:
                String strM984unboximpl3 = ((ChatId) obj).m984unboximpl();
                strM984unboximpl3.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT3 = q0iVar.d.e.t(strM984unboximpl3);
                if (chatConversationWithProjectReferenceT3 == null || (settings3 = chatConversationWithProjectReferenceT3.getSettings()) == null) {
                    return null;
                }
                return settings3.getEnabled_mcp_tools();
            case 4:
                String strM1035unboximpl = ((McpServerId) obj).m1035unboximpl();
                strM1035unboximpl.getClass();
                McpServer mcpServerL = q0iVar.p.l(strM1035unboximpl);
                return mcpServerL != null ? qok.f(mcpServerL) : lm6.E;
            case 5:
                String strM984unboximpl4 = ((ChatId) obj).m984unboximpl();
                strM984unboximpl4.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT4 = q0iVar.d.e.t(strM984unboximpl4);
                if (chatConversationWithProjectReferenceT4 == null || (settings4 = chatConversationWithProjectReferenceT4.getSettings()) == null) {
                    return null;
                }
                return settings4.getEnabled_monkeys_in_a_barrel();
            case 6:
                String strM984unboximpl5 = ((ChatId) obj).m984unboximpl();
                strM984unboximpl5.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT5 = q0iVar.d.e.t(strM984unboximpl5);
                if (chatConversationWithProjectReferenceT5 != null && (settings5 = chatConversationWithProjectReferenceT5.getSettings()) != null) {
                    strM184getCompass_modevlYN4T0 = settings5.m184getCompass_modevlYN4T0();
                }
                ResearchMode.Companion.getClass();
                return Boolean.valueOf(strM184getCompass_modevlYN4T0 != null ? ResearchMode.m1096equalsimpl0(strM184getCompass_modevlYN4T0, ResearchMode.ADVANCED) : false);
            default:
                String strM984unboximpl6 = ((ChatId) obj).m984unboximpl();
                strM984unboximpl6.getClass();
                ChatConversationWithProjectReference chatConversationWithProjectReferenceT6 = q0iVar.d.e.t(strM984unboximpl6);
                if (chatConversationWithProjectReferenceT6 == null || (settings6 = chatConversationWithProjectReferenceT6.getSettings()) == null) {
                    return null;
                }
                return settings6.getEnabled_web_search();
        }
    }
}
