package defpackage;

import com.anthropic.claude.sessions.api.ControlRequestContent;
import com.anthropic.claude.sessions.types.ControlResponseBody;
import com.anthropic.claude.sessions.types.ControlResponsePayload;
import com.anthropic.claude.sessions.types.SdkControlCancelRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlRequestEvent;
import com.anthropic.claude.sessions.types.SdkControlResponseEvent;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkImageContent;
import com.anthropic.claude.sessions.types.SdkMessage;
import com.anthropic.claude.sessions.types.SdkMessageContent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkTextContent;
import com.anthropic.claude.sessions.types.SdkTextMessageContent;
import com.anthropic.claude.sessions.types.SdkToolResultContent;
import com.anthropic.claude.sessions.types.StdinMessage;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonPrimitive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ix1 {
    public static final ih9 a = u00.c(new zv(25));

    public static final StdinMessage.ControlResponse a(String str, String str2, boolean z, Map map, List list, String str3) {
        str.getClass();
        str2.getClass();
        map.getClass();
        return new StdinMessage.ControlResponse((String) null, (String) null, new ControlResponseBody((String) null, str, new ControlResponsePayload(z ? "allow" : "deny", str2, z ? map : null, list, !z ? str3 == null ? "Denied by user" : str3 : null, (String) null, (Map) null, 96, (mq5) null), 1, (mq5) null), 3, (mq5) null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final StdinMessage.ControlResponse c(String str, boolean z, boolean z2) {
        Map mapSingletonMap;
        str.getClass();
        String str2 = z ? "accept" : "decline";
        if (z) {
            mapSingletonMap = Collections.singletonMap("verdict", ch9.c(z2 ? "always_allow" : "allow"));
            mapSingletonMap.getClass();
        } else {
            mapSingletonMap = null;
        }
        String str3 = null;
        return new StdinMessage.ControlResponse((String) null, str3, new ControlResponseBody(str3, str, new ControlResponsePayload((String) null, (String) null, (Map) null, (List) null, (String) null, str2, mapSingletonMap, 31, (mq5) null), 1, (mq5) (0 == true ? 1 : 0)), 3, (mq5) null);
    }

    public static final boolean d(ControlRequestContent controlRequestContent) {
        return h(controlRequestContent).contains("always_allow");
    }

    public static final ese e(List list) {
        List<SdkMessageContent> content;
        String request_id;
        List<SdkMessageContent> content2;
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SdkEvent sdkEvent = (SdkEvent) it.next();
            if (sdkEvent instanceof SdkControlResponseEvent) {
                SdkControlResponseEvent.Response response = ((SdkControlResponseEvent) sdkEvent).getResponse();
                if (response != null && (request_id = response.getRequest_id()) != null) {
                    linkedHashSet.add(request_id);
                }
            } else if (sdkEvent instanceof SdkControlCancelRequestEvent) {
                linkedHashSet.add(((SdkControlCancelRequestEvent) sdkEvent).getRequest_id());
            } else if (sdkEvent instanceof SdkMessageEvent) {
                SdkMessage message = ((SdkMessageEvent) sdkEvent).getMessage();
                SdkNonAssistantMessage sdkNonAssistantMessage = message instanceof SdkNonAssistantMessage ? (SdkNonAssistantMessage) message : null;
                if (sdkNonAssistantMessage != null && (content2 = sdkNonAssistantMessage.getContent()) != null) {
                    for (SdkMessageContent sdkMessageContent : content2) {
                        if (sdkMessageContent instanceof SdkToolResultContent) {
                            linkedHashSet2.add(((SdkToolResultContent) sdkMessageContent).getTool_use_id());
                        }
                    }
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = new mva(list).iterator();
        boolean z = false;
        while (true) {
            ListIterator listIterator = ((fse) it2).E;
            if (!listIterator.hasPrevious()) {
                return new ese(arrayList);
            }
            SdkEvent sdkEvent2 = (SdkEvent) listIterator.previous();
            if (sdkEvent2 instanceof SdkMessageEvent) {
                SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent2;
                if (x44.r(sdkMessageEvent.getType(), "user")) {
                    Boolean isMeta = sdkMessageEvent.getIsMeta();
                    Boolean bool = Boolean.TRUE;
                    if (!x44.r(isMeta, bool) && !x44.r(sdkMessageEvent.getIsSynthetic(), bool) && sdkMessageEvent.getParent_tool_use_id() == null) {
                        SdkMessage message2 = sdkMessageEvent.getMessage();
                        SdkNonAssistantMessage sdkNonAssistantMessage2 = message2 instanceof SdkNonAssistantMessage ? (SdkNonAssistantMessage) message2 : null;
                        if (sdkNonAssistantMessage2 != null && (content = sdkNonAssistantMessage2.getContent()) != null) {
                            List<SdkMessageContent> list2 = content;
                            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                                for (SdkMessageContent sdkMessageContent2 : list2) {
                                    if (!(sdkMessageContent2 instanceof SdkTextContent)) {
                                        if (!(sdkMessageContent2 instanceof SdkTextMessageContent)) {
                                            if (sdkMessageContent2 instanceof SdkImageContent) {
                                                z = true;
                                                break;
                                                break;
                                            }
                                        } else {
                                            ide ideVar = qn4.a;
                                            if (qn4.a(((SdkTextMessageContent) sdkMessageContent2).getText()) != null) {
                                                z = true;
                                                break;
                                                break;
                                            }
                                        }
                                    } else {
                                        ide ideVar2 = qn4.a;
                                        if (qn4.a(((SdkTextContent) sdkMessageContent2).getText()) != null) {
                                            z = true;
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (sdkEvent2 instanceof SdkControlRequestEvent) {
                SdkControlRequestEvent sdkControlRequestEvent = (SdkControlRequestEvent) sdkEvent2;
                if (!linkedHashSet.contains(sdkControlRequestEvent.getRequest_id())) {
                    ControlRequestContent controlRequestContentG = g(sdkControlRequestEvent);
                    boolean zR = x44.r(controlRequestContentG != null ? controlRequestContentG.getSubtype() : null, "can_use_tool");
                    if (zR) {
                        if (w44.G0(linkedHashSet2, controlRequestContentG != null ? controlRequestContentG.getTool_use_id() : null)) {
                        }
                    }
                    if (!z || !zR) {
                        arrayList.add(sdkEvent2);
                    }
                }
            }
        }
    }

    public static final boolean f(ControlRequestContent controlRequestContent) {
        Set setH = h(controlRequestContent);
        return setH.contains("allow") && setH.contains("deny");
    }

    public static final ControlRequestContent g(SdkControlRequestEvent sdkControlRequestEvent) {
        sdkControlRequestEvent.getClass();
        try {
            JsonElement request = sdkControlRequestEvent.getRequest();
            if (request != null) {
                return (ControlRequestContent) a.a(ControlRequestContent.Companion.serializer(), request);
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public static final Set h(ControlRequestContent controlRequestContent) {
        Object hreVar;
        try {
            JsonElement requested_schema = controlRequestContent.getRequested_schema();
            requested_schema.getClass();
            Object obj = ch9.i(requested_schema).get((Object) "properties");
            obj.getClass();
            Object obj2 = ch9.i((JsonElement) obj).get((Object) "verdict");
            obj2.getClass();
            Object obj3 = ch9.i((JsonElement) obj2).get((Object) "enum");
            obj3.getClass();
            JsonArray jsonArrayH = ch9.h((JsonElement) obj3);
            ArrayList arrayList = new ArrayList();
            for (JsonElement jsonElement : jsonArrayH) {
                JsonPrimitive jsonPrimitive = jsonElement instanceof JsonPrimitive ? (JsonPrimitive) jsonElement : null;
                String content = jsonPrimitive != null ? jsonPrimitive.getContent() : null;
                if (content != null) {
                    arrayList.add(content);
                }
            }
            hreVar = w44.t1(arrayList);
        } catch (Throwable th) {
            hreVar = new hre(th);
        }
        if (hreVar instanceof hre) {
            hreVar = um6.E;
        }
        return (Set) hreVar;
    }
}
