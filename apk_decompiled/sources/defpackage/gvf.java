package defpackage;

import com.anthropic.claude.sessions.types.SdkAssistantMessage;
import com.anthropic.claude.sessions.types.SdkEvent;
import com.anthropic.claude.sessions.types.SdkMessage;
import com.anthropic.claude.sessions.types.SdkMessageContent;
import com.anthropic.claude.sessions.types.SdkMessageEvent;
import com.anthropic.claude.sessions.types.SdkNonAssistantMessage;
import com.anthropic.claude.sessions.types.SdkResultEvent;
import com.anthropic.claude.sessions.types.SdkStreamEvent;
import com.anthropic.claude.sessions.types.SdkTextContent;
import com.anthropic.claude.sessions.types.SdkTextMessageContent;
import com.anthropic.claude.sessions.types.SdkToolResultContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes3.dex */
public final class gvf {
    public String a;
    public boolean b;
    public final TreeMap c;

    public gvf() {
        TreeMap treeMap = new TreeMap();
        sta.n0(treeMap, new cpc[0]);
        this.c = treeMap;
    }

    public static boolean d(SdkStreamEvent sdkStreamEvent) {
        sdkStreamEvent.getClass();
        if (sdkStreamEvent.getParent_tool_use_id() != null) {
            return false;
        }
        SdkStreamEvent.Payload event = sdkStreamEvent.getEvent();
        return x44.r(event != null ? event.getType() : null, "message_start");
    }

    public final boolean a(boolean z) {
        boolean z2 = g() != null;
        this.c.clear();
        this.b = false;
        if (!z && !z2) {
            return z2;
        }
        this.a = null;
        return z2;
    }

    public final boolean b() {
        Collection collectionValues = this.c.values();
        collectionValues.getClass();
        Collection<StringBuilder> collection = collectionValues;
        if (collection.isEmpty()) {
            return false;
        }
        for (StringBuilder sb : collection) {
            sb.getClass();
            if (sb.length() > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean c(SdkEvent sdkEvent) {
        List<SdkMessageContent> content;
        if (f(sdkEvent)) {
            return true;
        }
        if (!(sdkEvent instanceof SdkMessageEvent)) {
            return false;
        }
        SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent;
        if (sdkMessageEvent.getParent_tool_use_id() != null) {
            return false;
        }
        Boolean isMeta = sdkMessageEvent.getIsMeta();
        Boolean bool = Boolean.TRUE;
        if (x44.r(isMeta, bool) || x44.r(sdkMessageEvent.getIsSynthetic(), bool)) {
            return false;
        }
        SdkMessage message = sdkMessageEvent.getMessage();
        SdkNonAssistantMessage sdkNonAssistantMessage = message instanceof SdkNonAssistantMessage ? (SdkNonAssistantMessage) message : null;
        if (sdkNonAssistantMessage == null || (content = sdkNonAssistantMessage.getContent()) == null) {
            return false;
        }
        List<SdkMessageContent> list = content;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!(((SdkMessageContent) it.next()) instanceof SdkToolResultContent)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final boolean e(SdkStreamEvent sdkStreamEvent) {
        SdkStreamEvent.Payload event;
        String type;
        Integer index;
        SdkStreamEvent.Delta delta;
        String text;
        Integer index2;
        sdkStreamEvent.getClass();
        if (sdkStreamEvent.getParent_tool_use_id() == null && (event = sdkStreamEvent.getEvent()) != null && (type = event.getType()) != null) {
            int iHashCode = type.hashCode();
            TreeMap treeMap = this.c;
            switch (iHashCode) {
                case -1286099654:
                    if (type.equals("message_stop")) {
                        this.b = true;
                        return b();
                    }
                    break;
                case -1214396886:
                    if (type.equals("message_start")) {
                        boolean zB = b();
                        treeMap.clear();
                        SdkStreamEvent.MessageStart message = event.getMessage();
                        this.a = message != null ? message.getId() : null;
                        this.b = false;
                        return zB;
                    }
                    break;
                case 1521756864:
                    if (type.equals("content_block_delta") && (index = event.getIndex()) != null && (delta = event.getDelta()) != null && x44.r(delta.getType(), "text_delta") && (text = delta.getText()) != null && text.length() != 0) {
                        Object sb = treeMap.get(index);
                        if (sb == null) {
                            sb = new StringBuilder();
                            treeMap.put(index, sb);
                        }
                        StringBuilder sb2 = (StringBuilder) sb;
                        String string = sb2.toString();
                        if (string.length() <= 0 || !isg.q0(text, string, false)) {
                            sb2.append(text);
                            return true;
                        }
                        String strSubstring = text.substring(string.length());
                        if (strSubstring.length() != 0) {
                            sb2.append(strSubstring);
                            return true;
                        }
                    }
                    break;
                case 1536045930:
                    if (type.equals("content_block_start") && (index2 = event.getIndex()) != null) {
                        SdkStreamEvent.ContentBlock content_block = event.getContent_block();
                        if (x44.r(content_block != null ? content_block.getType() : null, "text")) {
                            String text2 = event.getContent_block().getText();
                            if (text2 == null) {
                                text2 = "";
                            }
                            Object sb3 = treeMap.get(index2);
                            if (sb3 == null) {
                                sb3 = new StringBuilder();
                                treeMap.put(index2, sb3);
                            }
                            ((StringBuilder) sb3).append(text2);
                            if (text2.length() > 0) {
                                return true;
                            }
                        }
                    }
                    break;
            }
        }
        return false;
    }

    public final boolean f(SdkEvent sdkEvent) {
        sdkEvent.getClass();
        if (sdkEvent instanceof SdkResultEvent) {
            return this.a == null;
        }
        if (!(sdkEvent instanceof SdkMessageEvent)) {
            return false;
        }
        SdkMessageEvent sdkMessageEvent = (SdkMessageEvent) sdkEvent;
        Boolean isMeta = sdkMessageEvent.getIsMeta();
        Boolean bool = Boolean.TRUE;
        if (x44.r(isMeta, bool) || x44.r(sdkMessageEvent.getIsSynthetic(), bool) || sdkMessageEvent.getParent_tool_use_id() != null) {
            return false;
        }
        SdkMessage message = sdkMessageEvent.getMessage();
        SdkAssistantMessage sdkAssistantMessage = message instanceof SdkAssistantMessage ? (SdkAssistantMessage) message : null;
        if (sdkAssistantMessage == null) {
            return false;
        }
        List<SdkMessageContent> content = sdkAssistantMessage.getContent();
        if ((content instanceof Collection) && content.isEmpty()) {
            return false;
        }
        for (SdkMessageContent sdkMessageContent : content) {
            if (sdkMessageContent instanceof SdkTextContent) {
                ide ideVar = qn4.a;
                String text = ((SdkTextContent) sdkMessageContent).getText();
                text.getClass();
                if (qn4.b(text).length() > 0) {
                    return this.a != null ? true : true;
                }
            } else if (sdkMessageContent instanceof SdkTextMessageContent) {
                ide ideVar2 = qn4.a;
                String text2 = ((SdkTextMessageContent) sdkMessageContent).getText();
                text2.getClass();
                if (qn4.b(text2).length() > 0) {
                    return this.a != null ? true : true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public final mqg g() {
        if (!b()) {
            return null;
        }
        Collection collectionValues = this.c.values();
        collectionValues.getClass();
        Collection<StringBuilder> collection = collectionValues;
        ArrayList arrayList = new ArrayList(x44.y(collection, 10));
        for (StringBuilder sb : collection) {
            ide ideVar = qn4.a;
            arrayList.add(qn4.b(sb.toString()));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new mqg(this.a, arrayList2, this.b);
    }
}
