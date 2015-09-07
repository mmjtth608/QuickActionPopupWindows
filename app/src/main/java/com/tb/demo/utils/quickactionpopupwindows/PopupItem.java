package com.tb.demo.utils.quickactionpopupwindows;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/**
 * Created by tangbin on 15/9/7.
 */
public class PopupItem {
    private Drawable icon;
    private Bitmap thumb;
    private String title;
    private int actionId = -1;
    private boolean selected;
    private boolean sticky;

    /**
     * 构造方法
     * 
     * @param actionId
     * @param title
     * @param icon
     */
    public PopupItem(int actionId, String title, Drawable icon) {
        this.title = title;
        this.icon = icon;
        this.actionId = actionId;
    }

    /**
     * 构造方法
     */
    public PopupItem() {
        this(-1, null, null);
    }

    /**
     * 构造方法
     * 
     * @param actionId
     * @param title
     */
    public PopupItem(int actionId, String title) {
        this(actionId, title, null);
    }

    /**
     * 构造方法
     * 
     * @param icon
     */
    public PopupItem(Drawable icon) {
        this(-1, null, icon);
    }

    /**
     * 构造方法
     * 
     * @param actionId
     * @param icon
     */
    public PopupItem(int actionId, Drawable icon) {
        this(actionId, null, icon);
    }

    /**
     * 设置文字
     * 
     * @param title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取文字
     * 
     * @return
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * 设置图标
     * 
     * @param icon
     */
    public void setIcon(Drawable icon) {
        this.icon = icon;
    }

    /**
     * 获取图标
     * 
     * @return
     */
    public Drawable getIcon() {
        return this.icon;
    }

    /**
     * 设置actionid
     * 
     * @param actionId
     */
    public void setActionId(int actionId) {
        this.actionId = actionId;
    }

    /**
     * 获取actionid
     * 
     * @return
     */
    public int getActionId() {
        return actionId;
    }

    /**
     * 设置是否消失
     *
     * @param sticky
     *            true：不消失
     */
    public void setSticky(boolean sticky) {
        this.sticky = sticky;
    }

    /**
     * 获取消失状态
     * 
     * @return
     */
    public boolean isSticky() {
        return sticky;
    }

    /**
     * 设置是否可选中
     * 
     * @param selected
     */
    public void setSelected(boolean selected) {
        this.selected = selected;
    }

    /**
     * 是否可被选中
     * 
     * @return
     */
    public boolean isSelected() {
        return this.selected;
    }

    /**
     * 设置 thumb
     *
     * @param thumb
     * 
     */
    public void setThumb(Bitmap thumb) {
        this.thumb = thumb;
    }

    /**
     * 获取thumb
     * 
     * @return
     */
    public Bitmap getThumb() {
        return this.thumb;
    }
}