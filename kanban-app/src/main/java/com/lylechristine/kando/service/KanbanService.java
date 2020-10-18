package com.lylechristine.kando.service;

import com.lylechristine.kando.model.Kanban;
import com.lylechristine.kando.model.KanbanDTO;
import com.lylechristine.kando.model.TaskDTO;

import java.util.List;
import java.util.Optional;

public interface KanbanService {

    List<Kanban> getAllKanbanBoards();

    Optional<Kanban> getKanbanById(Long id);

    Optional<Kanban> getKanbanByTitle(String title);

    Kanban saveNewKanban(KanbanDTO kanbanDTO);

    Kanban updateKanban(Kanban oldKanban, KanbanDTO newKanbanDTO);

    void deleteKanban(Kanban kanban);

    Kanban addNewTaskToKanban(Long kanbanId, TaskDTO taskDTO);
}
