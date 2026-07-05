package defpackage;

import anthropic.claude.usercontent.sandbox.RunCodeRequest;
import com.anthropic.claude.api.chat.tool.ArtifactToolInput;
import com.anthropic.claude.api.chat.tool.ToolUseInput;
import com.anthropic.claude.tool.model.SearchToolInput;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: classes2.dex */
public final class pc3 extends xzg implements pz7 {
    public final /* synthetic */ int E;
    public final /* synthetic */ ToolUseInput F;
    public final /* synthetic */ sc3 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pc3(ToolUseInput toolUseInput, sc3 sc3Var, tp4 tp4Var, int i) {
        super(2, tp4Var);
        this.E = i;
        this.F = toolUseInput;
        this.G = sc3Var;
    }

    @Override // defpackage.vd1
    public final tp4 create(Object obj, tp4 tp4Var) {
        int i = this.E;
        sc3 sc3Var = this.G;
        ToolUseInput toolUseInput = this.F;
        switch (i) {
            case 0:
                return new pc3(toolUseInput, sc3Var, tp4Var, 0);
            case 1:
                return new pc3(toolUseInput, sc3Var, tp4Var, 1);
            default:
                return new pc3(toolUseInput, sc3Var, tp4Var, 2);
        }
    }

    @Override // defpackage.pz7
    public final Object invoke(Object obj, Object obj2) {
        int i = this.E;
        iei ieiVar = iei.a;
        l45 l45Var = (l45) obj;
        tp4 tp4Var = (tp4) obj2;
        switch (i) {
        }
        return ((pc3) create(l45Var, tp4Var)).invokeSuspend(ieiVar);
    }

    @Override // defpackage.vd1
    public final Object invokeSuspend(Object obj) {
        int i = this.E;
        sc3 sc3Var = this.G;
        ToolUseInput toolUseInput = this.F;
        String string = null;
        switch (i) {
            case 0:
                bg9 bg9Var = sc3Var.c;
                sf5.h0(obj);
                String partial_json = toolUseInput.getPartial_json();
                try {
                    fof fofVar = bg9Var.b;
                    pl9 pl9VarB = jce.a.b(RunCodeRequest.class);
                    fofVar.getClass();
                    KSerializer kSerializerB = fofVar.b(pl9VarB, lm6.E);
                    if (kSerializerB != null) {
                        return bsg.k1(((RunCodeRequest) bg9Var.b(partial_json, kSerializerB)).getCode()).toString();
                    }
                    throw new SerializationException(yfd.M(pl9VarB));
                } catch (Exception e) {
                    if (e instanceof SerializationException) {
                        ova ovaVarB = sc3Var.d.b(partial_json);
                        if (ovaVarB != null) {
                            String str = ((mva) ovaVarB.a()).get(1) + "\"";
                            try {
                                string = bsg.k1((String) bg9Var.b(str, srg.a)).toString();
                            } catch (Exception e2) {
                                List list = xah.a;
                                Map mapSingletonMap = Collections.singletonMap("json_parse_failed_content", str);
                                mapSingletonMap.getClass();
                                xah.f(e2, "Failed to parse analysis tool use code", null, mapSingletonMap, 20);
                            }
                            if (string != null) {
                                return string;
                            }
                        }
                        break;
                    } else {
                        List list2 = xah.a;
                        Map mapSingletonMap2 = Collections.singletonMap("json_parse_failed_content", partial_json);
                        mapSingletonMap2.getClass();
                        xah.f(e, "Failed to parse analysis tool use", null, mapSingletonMap2, 20);
                    }
                    return "";
                }
            case 1:
                sf5.h0(obj);
                String partial_json2 = toolUseInput.getPartial_json();
                try {
                    return (ArtifactToolInput) sc3Var.c.b(partial_json2, ArtifactToolInput.Companion.serializer());
                } catch (Exception e3) {
                    List list3 = xah.a;
                    Map mapSingletonMap3 = Collections.singletonMap("json_parse_failed_content", partial_json2);
                    mapSingletonMap3.getClass();
                    xah.f(e3, "Failed to parse artifact tool input", null, mapSingletonMap3, 20);
                    return null;
                }
            default:
                sf5.h0(obj);
                String partial_json3 = toolUseInput.getPartial_json();
                try {
                    return ((SearchToolInput) sc3Var.c.b(partial_json3, SearchToolInput.Companion.serializer())).getQuery();
                } catch (Exception e4) {
                    if (e4 instanceof SerializationException) {
                        return null;
                    }
                    List list4 = xah.a;
                    Map mapSingletonMap4 = Collections.singletonMap("json_parse_failed_content", partial_json3);
                    mapSingletonMap4.getClass();
                    xah.f(e4, "Failed to parse search tool input", null, mapSingletonMap4, 20);
                    return null;
                }
        }
    }
}
