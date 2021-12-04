package swing;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.File;

public class Chooser {
    File[] filesPath;

    public void chooseFiles() {
        JFileChooser chooser = new JFileChooser();
        setUpdateUI(chooser);
        chooser.setMultiSelectionEnabled(true);
        chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        chooser.setFileHidingEnabled(true);
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "PDF файлы", "pdf");
        chooser.setFileFilter(filter);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
            filesPath = chooser.getSelectedFiles();
//            java.io.File directory = chooser.getCurrentDirectory();
//            System.out.println(directory);
//            for (File file : files) {
//                System.out.println(file.getPath());
//            }
        }
    }

    public static JFileChooser setUpdateUI(JFileChooser choose) {
        UIManager.put("FileChooser.openButtonText", "Открыть");
        UIManager.put("FileChooser.cancelButtonText", "Отмена");
        UIManager.put("FileChooser.lookInLabelText", "Смотреть в");
        UIManager.put("FileChooser.fileNameLabelText", "Имя файла");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Тип файла");

        UIManager.put("FileChooser.saveButtonText", "Сохранить");
        UIManager.put("FileChooser.saveButtonToolTipText", "Сохранить");
        UIManager.put("FileChooser.openButtonText", "Открыть");
        UIManager.put("FileChooser.openButtonToolTipText", "Открыть");
        UIManager.put("FileChooser.cancelButtonText", "Отмена");
        UIManager.put("FileChooser.cancelButtonToolTipText", "Отмена");

        UIManager.put("FileChooser.lookInLabelText", "Папка");
        UIManager.put("FileChooser.saveInLabelText", "Папка");
        UIManager.put("FileChooser.fileNameLabelText", "Имя файла");
        UIManager.put("FileChooser.filesOfTypeLabelText", "Тип файлов");

        UIManager.put("FileChooser.upFolderToolTipText", "На один уровень вверх");
        UIManager.put("FileChooser.newFolderToolTipText", "Создание новой папки");
        UIManager.put("FileChooser.listViewButtonToolTipText", "Список");
        UIManager.put("FileChooser.detailsViewButtonToolTipText", "Таблица");
        UIManager.put("FileChooser.fileNameHeaderText", "Имя");
        UIManager.put("FileChooser.fileSizeHeaderText", "Размер");
        UIManager.put("FileChooser.fileTypeHeaderText", "Тип");
        UIManager.put("FileChooser.fileDateHeaderText", "Изменен");
        UIManager.put("FileChooser.fileAttrHeaderText", "Атрибуты");

        UIManager.put("FileChooser.acceptAllFileFilterText", "Все файлы");
        choose.updateUI();

        return choose;
    }

    public File[] getFilesPath() {
        this.chooseFiles();
        return filesPath;
    }
}
